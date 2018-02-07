package com.integ.integration.services.contracts.common.test;

import com.integ.integration.services.contracts.common.test.dto.AbstractComplexObject;
import com.integ.integration.services.contracts.common.test.dto.ComplexObjectA;
import com.integ.integration.services.contracts.common.test.dto.ComplexObjectB;
import com.integ.integration.services.contracts.common.test.dto.ListsDummyRequest;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.junit4.TestSupport;
import org.apache.camel.test.spring.DisableJmx;
import org.apache.camel.test.spring.ShutdownTimeout;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;



@DisableJmx
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:/test-context.xml",
})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@ShutdownTimeout(120)
public class DummyTest extends TestSupport {
    private static boolean initialised = false;

    private static final int PORT1 = AvailablePortFinder.getNextAvailable(new Random().nextInt(60000) + 2000);
    private static final int PORT2 = AvailablePortFinder.getNextAvailable(new Random().nextInt(60000) + 2000);

    @Autowired
    private ModelCamelContext camelContext;

    @EndpointInject(uri = "direct:startPostDates")
    private ProducerTemplate startPostDates;
    @EndpointInject(uri = "direct:startPostNumbers")
    private ProducerTemplate startPostNumbers;
    @EndpointInject(uri = "direct:startPostLists")
    private ProducerTemplate startPostLists;
    @EndpointInject(uri = "direct:startPostAbstract")
    private ProducerTemplate startPostAbstract;
    @EndpointInject(uri = "direct:startGet")
    private ProducerTemplate startGet;
    @EndpointInject(uri = "direct:startGetError")
    private ProducerTemplate startGetError;

    @EndpointInject(uri = "mock:result")
    private MockEndpoint result;


    static {
        System.setProperty("org.apache.cxf.transports.http_jetty.DontClosePort", "true");
        System.setProperty("http.port1", Integer.toString(PORT1));
        System.setProperty("http.port2", Integer.toString(PORT2));
    }

    @Before
    public void setup() throws Exception {
        MockEndpoint.resetMocks(camelContext);

        if (initialised != true) {
            initialised = true;

            RouteBuilder builder = new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("direct:startPostDates")
                            .setExchangePattern(ExchangePattern.InOut)
                            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                            .setHeader(Exchange.HTTP_PATH, constant("/testDates"))
                            .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                            .setHeader("Accept", constant("application/json"))
                            .to("cxfrs:bean:datesServiceClient?throwExceptionOnFailure=false")
                            .convertBodyTo(String.class)
                            .to("mock:result");
                    from("direct:startPostNumbers")
                            .setExchangePattern(ExchangePattern.InOut)
                            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                            .setHeader(Exchange.HTTP_PATH, constant("/testNumbers"))
                            .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                            .setHeader("Accept", constant("application/json"))
                            .to("cxfrs:bean:numericServiceClient?throwExceptionOnFailure=false")
                            .convertBodyTo(String.class)
                            .to("mock:result");
                    from("direct:startPostLists")
                            .setExchangePattern(ExchangePattern.InOut)
                            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                            .setHeader(Exchange.HTTP_PATH, constant("/testLists"))
                            .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                            .setHeader("Accept", constant("application/json"))
                            .to("cxfrs:bean:listsServiceClient?throwExceptionOnFailure=false")
                            .convertBodyTo(String.class)
                            .to("mock:result");
                    from("direct:startPostAbstract")
                            .setExchangePattern(ExchangePattern.InOut)
                            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                            .setHeader(Exchange.HTTP_PATH, constant("/testAbstract"))
                            .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                            .setHeader("Accept", constant("application/json"))
                            .to("cxfrs:bean:abstractServiceClient?throwExceptionOnFailure=false")
                            .convertBodyTo(String.class)
                            .to("mock:result");

                    from("direct:startGet")
                            .setExchangePattern(ExchangePattern.InOut)
                            .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                            .setHeader(Exchange.HTTP_PATH, simple("/getTest/${body}"))
                            .setHeader("Accept", constant("application/json"))
                            .to("cxfrs:bean:getServiceClient?throwExceptionOnFailure=false")
                            .to("mock:result");
                    from("direct:startGetError")
                            .setExchangePattern(ExchangePattern.InOut)
                            .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                            .setHeader(Exchange.HTTP_PATH, simple("/getError/${header.ERROR_ID}"))
                            .setHeader("Accept", constant("application/json"))
                            .to("cxfrs:bean:getServiceClient?throwExceptionOnFailure=false")
                            .to("mock:result");
                }
            };
            camelContext.addRoutes(builder);
        }
    }

    @Test
    public void testLists() throws InterruptedException {
        result.expectedMessageCount(1);

        List<String> strings = new ArrayList<>();
        strings.add("STRING1");
        strings.add("STRING2");
        List<Calendar> dateTimes = new ArrayList<>();
        dateTimes.add(Calendar.getInstance());
        dateTimes.add(Calendar.getInstance());
        List<Calendar> dates = new ArrayList<>();
        dates.add(Calendar.getInstance());
        dates.add(Calendar.getInstance());
        List<BigDecimal> decimals = new ArrayList<>();
        decimals.add(new BigDecimal("1.00010"));
        decimals.add(new BigDecimal("1.00011"));
        List<Integer> integers = new ArrayList<>();
        integers.add(-1);
        integers.add(1);
        List<Long> longs = new ArrayList<>();
        longs.add(-1L);
        longs.add(1L);
        Object response = startPostLists.requestBody(new ListsDummyRequest(strings, dateTimes, dates, decimals, integers, longs));

        result.assertIsSatisfied();
        assertEquals("200", result.getExchanges().get(0).getIn().getHeader("CamelHttpResponseCode", String.class));

        String responseBody = result.getExchanges().get(0).getIn().getBody(String.class);
        assertStringContains(responseBody, "{\"string\":[\"STRING1\",\"STRING2\"],\"dateTime\":[\"");
        assertStringContains(responseBody, "],\"date\":[");
        assertStringContains(responseBody, "\"],\"dn\":[\"1.00010\",\"1.00011\"],\"in\":[\"-1\",\"1\"],\"ln\":[\"-1\",\"1\"]}");
        assertTrue(!responseBody.contains("ArrayList"));
        assertTrue(!responseBody.contains("Calendar"));
    }

    @Test
    public void testAbstracts() throws InterruptedException, IOException, URISyntaxException {
        String expected = loadFile("/expectations/testAbstract.json");

        result.expectedMessageCount(1);
        ComplexObjectA a = new ComplexObjectA("string", null, null, "a stringA");
        ComplexObjectB b = new ComplexObjectB("string", null, null, "b stringB");

        List<AbstractComplexObject> abstracts = new ArrayList<>();
        abstracts.add(a);
        abstracts.add(b);
        Object response = startPostAbstract.requestBody(new ComplexObjectA("string", b, abstracts, "stringA"));

        result.assertIsSatisfied();
        assertEquals("201", result.getExchanges().get(0).getIn().getHeader("CamelHttpResponseCode", String.class));
        assertEquals(expected, result.getExchanges().get(0).getIn().getBody(String.class));
    }

    protected String loadFile(String fileName) throws IOException, URISyntaxException {
        URI uri = this.getClass().getResource(fileName).toURI();
        return FileUtils.readFileToString(new File(uri));
    }
}
