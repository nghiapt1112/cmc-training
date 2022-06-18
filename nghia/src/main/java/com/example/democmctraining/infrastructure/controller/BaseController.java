package com.example.democmctraining.infrastructure.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BaseController {

    @ExceptionHandler(RuntimeException.class)
    public void rootException(RuntimeException ex) {
        System.out.println("Exception da vao day.");
    }
}
