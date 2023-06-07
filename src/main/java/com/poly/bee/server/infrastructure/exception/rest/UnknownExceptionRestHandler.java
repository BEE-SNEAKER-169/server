package com.poly.bee.server.infrastructure.exception.rest;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public final class UnknownExceptionRestHandler extends
        ServerExceptionRestHandler<Exception> {

    @Override
    protected Object wrapApi(Exception ex) {
        return ex.getMessage();
    }
}
