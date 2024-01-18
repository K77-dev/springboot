package br.com.cod3r.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/methods")
public class MethodsController{

    @GetMapping
    public String get(){
        return "Get Method";
    }

    @PostMapping
    public String post(){
        return "Post Method";
    }

    @PutMapping
    public String put(){
        return "Put Method";
    }

    @PatchMapping
    public String patch(){
        return "Patch Method";
    }

    @DeleteMapping
    public String delete(){
        return "Delete Method";
    }
}
