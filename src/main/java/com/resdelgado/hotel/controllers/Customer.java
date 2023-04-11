package com.resdelgado.hotel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola que tal...";
    }
}
