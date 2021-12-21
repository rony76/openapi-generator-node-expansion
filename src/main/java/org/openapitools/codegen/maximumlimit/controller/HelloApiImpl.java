package org.openapitools.codegen.maximumlimit.controller;

import org.openapitools.codegen.maximumlimit.api.HelloApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiImpl implements HelloApi {
    @Override
    public ResponseEntity<String> fetchGreetings(Integer limit) {
        return ResponseEntity.ok("Hello!");
    }
}
