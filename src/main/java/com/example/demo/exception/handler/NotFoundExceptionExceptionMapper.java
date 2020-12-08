package com.example.demo.exception.handler;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionExceptionMapper implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(prepareMessage(exception)).type("text/plain")
                .build();
    }

    private String prepareMessage(NotFoundException exception) {
        StringBuilder message = new StringBuilder();

        message.append(exception.getMessage() + "\n");

        return message.toString();
    }
}
