package com.customer.rest.exception;


import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.springframework.http.MediaType;

import com.customer.rest.errorResponse.ErrorResponse;

@Provider
@Produces({MediaType.APPLICATION_JSON})
public class CustomerNotFoundException {

	@Override
	public Response toResponse(CustomerNotFoundException exception) {
		final ErrorResponse entity = new ErrorResponse("ERR---------": exception.getMessage());
		
		return Response.serverError().type(MediaType.APPLICATION_ATOM_XML).entity(entity).build();
	}
}
