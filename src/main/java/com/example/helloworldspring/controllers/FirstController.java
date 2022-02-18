package com.example.helloworldspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.DayOfWeek;

@RestController

public class FirstController {

    // exercise 1.1
    @GetMapping
    public String hello(){
        return "Herro, how r u";
    }

    // exercise 1.2
    @GetMapping("/echo")
    public String endPoint(@RequestParam String input){
        return input;
    }

    // exercise 1.3
    @GetMapping("/isItFriday")
    public String isItFriday(){
        DayOfWeek dayOfWeek = new DayOfWeek();
        return dayOfWeek.friday() + "";

    }
}
