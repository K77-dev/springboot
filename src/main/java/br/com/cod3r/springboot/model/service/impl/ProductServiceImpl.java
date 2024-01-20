package br.com.cod3r.springboot.model.service.impl;

import br.com.cod3r.springboot.model.entity.Product;
import br.com.cod3r.springboot.model.repository.IProductRepository;
import br.com.cod3r.springboot.model.service.IProductService;
import br.com.cod3r.springboot.model.service.generic.IGenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends IGenericServiceImpl<Product, Integer> implements IProductService {

    @Autowired
    private IProductRepository repository;

    public ProductServiceImpl(IProductRepository repository) {
        super(repository);
    }
}
