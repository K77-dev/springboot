package br.com.cod3r.springboot.model.service.impl;

import br.com.cod3r.springboot.model.entity.Product;
import br.com.cod3r.springboot.model.repository.IGenericRepository;
import br.com.cod3r.springboot.model.repository.IProductRepository;
import br.com.cod3r.springboot.model.service.IProductService;
import br.com.cod3r.springboot.model.service.generic.IGenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl extends IGenericServiceImpl<Product, Integer> implements IProductService {

    @Autowired
    private IProductRepository repository;

    public ProductServiceImpl(IProductRepository repository) {
        super(repository);
    }

    public List<Product> findByPrice(Double price){
        return repository.getProductsByPriceGreaterThanEqual(price);
    }

    @Override
    public Optional<Product> findMaxPrice() {
        return repository.findTopByOrderByPriceDesc();
    }
}
