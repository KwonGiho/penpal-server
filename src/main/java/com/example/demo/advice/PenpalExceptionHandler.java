package com.example.demo.advice;

import com.example.demo.response.PenpalResponse;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kwongiho on 2018. 1. 13..
 */

@RestControllerAdvice
public class PenpalExceptionHandler {

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public PenpalResponse<?> catchHttpRequestMethodNotSupportedException(HttpServletRequest req, Exception exception) {
        return new PenpalResponse<>(404,"NOT FOUND URL ");
    }
}
