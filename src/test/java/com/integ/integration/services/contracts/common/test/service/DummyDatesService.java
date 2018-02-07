package com.integ.integration.services.contracts.common.test.service;

import com.integ.integration.services.contracts.common.test.dto.AbstractDatesDummy;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public interface DummyDatesService {

    @POST
    @Path("/testDates")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    AbstractDatesDummy testDates(AbstractDatesDummy dummyRequest);
}
