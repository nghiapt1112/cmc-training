package com.example.democmctraining.domain.user.controller;

import com.example.democmctraining.infrastructure.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController {
    @GetMapping("")
    public void getOrder() {
        return "hehe";
    }
}
