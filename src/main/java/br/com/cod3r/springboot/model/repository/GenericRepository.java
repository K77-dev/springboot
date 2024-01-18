package br.com.cod3r.springboot.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T> extends CrudRepository<T, Integer> {}

