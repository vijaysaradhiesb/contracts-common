package com.integ.integration.services.contracts.common.rest;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxrs.impl.ResponseImpl;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


public class ResponseCodeSettingInterceptor extends AbstractPhaseInterceptor<Message> {
    public ResponseCodeSettingInterceptor() {
        super(Phase.MARSHAL);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        if (!isValidResponse(message)) {
            return;
        }

        ResponseImpl response = ((ResponseImpl) message.getContent(List.class).get(0));
        Object responseObject = response.getEntity();
        ResponseCode responseCode = responseObject.getClass().getAnnotation(ResponseCode.class);
        XmlRootElement xmlRootElement = responseObject.getClass().getAnnotation(XmlRootElement.class);

        if (xmlRootElement != null) {
            if (responseCode != null) {
                response.setStatus(responseCode.value().getStatusCode());
            } else {
                throw new IllegalArgumentException("Response type: " + responseObject.getClass().getCanonicalName() + " is not annotated with ResponseCode annotation");
            }
        }
    }

    private boolean isValidResponse(Message message) {
        if (message.getContent(List.class) == null) {
            return false;
        }

        ResponseImpl response = ((ResponseImpl) message.getContent(List.class).get(0));

        if (response == null || response.getEntity() == null) {
            return false;
        }

        return true;
    }
}
