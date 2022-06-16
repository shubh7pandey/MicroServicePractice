package com.mycompany.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/bookServiceFallBack")
    public String bookServiceFallBackMethod() {
        return "Book Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBackMethod() {
        return "Order Service is taking longer than Expected." +
                " Please try again later";
    }
}
