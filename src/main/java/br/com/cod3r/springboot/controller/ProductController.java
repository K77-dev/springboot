package br.com.cod3r.springboot.controller;

import br.com.cod3r.springboot.model.entity.Product;
import br.com.cod3r.springboot.model.service.GenericService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private GenericService<Product> service;

//    @PostMapping
//    public Product add(@RequestParam String name, @RequestParam Double price, @RequestParam Double discount){
//        return productService.add(name, price, discount);
//    }

    @PostMapping
    public Product add(@Valid Product product) {
        return service.add(product);
    }

    @GetMapping
    public Iterable<Product> getAll() {
        return service.getAll();
    }
}
