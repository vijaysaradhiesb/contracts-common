package com.integ.integration.services.contracts.common.test.service;

import com.integ.integration.services.contracts.common.test.dto.AbstractDummy;
import org.apache.camel.Header;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface DummyGetService {

    @GET
    @Path("/getTest/{SOME_ID}")
    @Produces({MediaType.APPLICATION_JSON})
    AbstractDummy getTest(@PathParam("SOME_ID") String someId);

    @GET
    @Path("/getError/{ERROR_ID}")
    @Produces({MediaType.APPLICATION_JSON})
    AbstractDummy getError(@Header("ERROR_ID") @PathParam("ERROR_ID") String error);

}
