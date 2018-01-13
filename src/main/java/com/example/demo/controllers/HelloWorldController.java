package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kwongiho on 2018. 1. 13..
 */

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }
}
