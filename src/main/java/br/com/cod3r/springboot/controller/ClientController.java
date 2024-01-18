package br.com.cod3r.springboot.controller;

import br.com.cod3r.springboot.model.entity.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public Client get(){
        return new Client(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable int id){
        return new Client(id, "Maria", "987.654.321-00");
    }

    @GetMapping(path = "/ById")
    public Client getById2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Client(id, "João Augusto", "987.654.321-00");
    }
}
