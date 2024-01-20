package br.com.cod3r.springboot.model.service.generic;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IGenericService<T, ID> {

    T save(T entity);

    void delete(ID id);

    Optional<T> getById(ID id);

    Iterable<T> getAll();
}
