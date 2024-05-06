package com.app.pokedex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/simplejson")
    public String getSimpleJson() {
        return "{\"message\": \"Hello, world!\"}";
    }
}
