package com.customer.rest.exceptionHandler;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.springframework.http.MediaType;

import com.customer.rest.errorResponse.ErrorResponse;




@Provider
@Produces({ MediaType.APPLICATION_JSON })
public class CustomerNotFoundExceptionHandler {
	//@Override
	public Response toResponse(CustomerNotFoundExceptionHandler exception) {
		final ErrorResponse entity = new ErrorResponse("ERR---------"; exception.getMessage());
		
		return Response.status().type(MediaType.APPLICATION_ATOM_XML).entity(entity).build();
	}
}


