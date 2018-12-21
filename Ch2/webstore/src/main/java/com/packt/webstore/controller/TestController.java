package com.packt.webstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String test() {
        System.out.println("Running /test");
        return "Hello Spring MVC";
    }
}