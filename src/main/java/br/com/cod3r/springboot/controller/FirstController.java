package br.com.cod3r.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = {"/", "/hello"})
    public String hello() {
        return "Hello Spring Boot!";
    }

}


