package com.gradle.base.base.Controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot 3.2.0!";
    }
}