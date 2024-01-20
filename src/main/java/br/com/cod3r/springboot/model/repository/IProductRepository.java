package br.com.cod3r.springboot.model.repository;

import br.com.cod3r.springboot.model.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends IGenericRepository<Product, Integer> {}

