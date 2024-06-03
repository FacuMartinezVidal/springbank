package com.springbank.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account")
    public String getAccount() {
        return "Account details";
    }
}
