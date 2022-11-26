package uz.spring.mvc_market.configuration.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
    @GetMapping("/hello")
    public String method() {
        return "hello world";
    }
}
