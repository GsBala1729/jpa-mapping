package com.tekhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TekRestController {

    @GetMapping("/test")
    public String testServer(){
        return "Hello";
    }
}
