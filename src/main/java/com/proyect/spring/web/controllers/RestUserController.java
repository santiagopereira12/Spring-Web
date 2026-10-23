package com.proyect.spring.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestUserController {

    @GetMapping("/detailsRest")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo with Spring Boot");
        body.put("name","Santiago");
        body.put("lastname","Pereira");
        return body;
    }
}
