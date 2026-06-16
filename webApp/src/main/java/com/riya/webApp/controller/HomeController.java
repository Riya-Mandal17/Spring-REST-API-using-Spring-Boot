package com.riya.webApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to riold";
    }

    @RequestMapping("/about")
    public String about(){
        return "I have to learn, I have to leave  this place and the situation ";
    }
}
