package com.integ.integration.services.contracts.common.providers;

import com.integ.integration.services.contracts.common.FaultDetails;
import com.integ.integration.services.contracts.common.Message;
import org.apache.camel.CamelExchangeException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by klimczakp on 03/03/2017.
 */
public class SchemaValidationExceptionMapperProvider implements ExceptionMapper<CamelExchangeException> {
    @Override
    public Response toResponse(CamelExchangeException exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(new FaultDetails().withMessage(new Message("Validation Error", "EN"))).build();
    }
}
