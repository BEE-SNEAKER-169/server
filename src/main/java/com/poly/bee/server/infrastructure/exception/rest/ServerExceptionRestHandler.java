package com.poly.bee.server.infrastructure.exception.rest;

import com.poly.bee.server.infrastructure.exception.ServerExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class ServerExceptionRestHandler<Z extends Exception>
        extends ServerExceptionHandler<ResponseEntity<?>,Z> {

    @Override
    protected ResponseEntity<?> wrap(Z ex) {
        return new ResponseEntity<>(wrapApi(ex), HttpStatus.BAD_REQUEST);
    }

    protected abstract Object wrapApi(Z ex);
}