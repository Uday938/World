package com.example.Hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/Publish")
    public String hello()
    {
        return "hello world how are you ";
    }
}

