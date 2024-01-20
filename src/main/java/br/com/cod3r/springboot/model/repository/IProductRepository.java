package br.com.cod3r.springboot.model.repository;

import br.com.cod3r.springboot.model.entity.Product;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductRepository extends IGenericRepository<Product, Integer> {
    List<Product> getProductsByPriceGreaterThanEqual(@Param("price") Double price);

    ;
    Optional<Product> findTopByOrderByPriceDesc();
}

