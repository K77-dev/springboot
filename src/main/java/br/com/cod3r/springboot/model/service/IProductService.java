package br.com.cod3r.springboot.model.service;

import br.com.cod3r.springboot.model.entity.Product;
import br.com.cod3r.springboot.model.service.generic.IGenericService;

import java.util.List;
import java.util.Optional;

public interface IProductService extends IGenericService<Product, Integer> {
    List<Product> findByPrice(Double price);
    Optional<Product> findMaxPrice();
}
