package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kwongiho on 2018. 1. 15..
 */

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {

    @GetMapping("/{message}")
    public String sendMessage(@PathVariable String message) {
        return message;
    }
}
