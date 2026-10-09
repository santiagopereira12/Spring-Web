package com.proyect.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/spring")
public class UserController {
    @GetMapping("/details")
    public String details(){
        return "details";
    }
}
