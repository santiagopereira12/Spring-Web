package com.proyect.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/spring")
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo with Spring Boot");
        model.addAttribute("name","Santiago");
        model.addAttribute("lastname","Pereira");
        return "details";
    }
}
