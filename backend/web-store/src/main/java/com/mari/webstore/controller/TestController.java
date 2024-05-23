package com.mari.webstore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mari.core.model.Test;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        Test test = new Test("Test", "3434", "3434");
        return "Test: " + test.getName() + " " + test.getEmail() + " " + test.getPassword();
    }

}
