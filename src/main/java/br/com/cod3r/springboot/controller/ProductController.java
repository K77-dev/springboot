package br.com.cod3r.springboot.controller;

import br.com.cod3r.springboot.model.entity.Product;
import br.com.cod3r.springboot.model.service.IProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService service;

//    @PostMapping
//    public Product add(@RequestParam String name, @RequestParam Double price, @RequestParam Double discount){
//        return productService.add(name, price, discount);
//    }

    @PostMapping
    public Product add(@Valid Product product) {
        return service.save(product);
    }

    @GetMapping
    public Iterable<Product> getAll() {
        return service.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @GetMapping(path = "/price/{price}")
    public List<Product> findByPrice(@PathVariable Double price){
        return service.findByPrice(price);
    }

    @GetMapping(path = "/price/max")
    public Optional<Product> findMaxPrice(){
        return service.findMaxPrice();
    }

}
