package br.com.cod3r.springboot.model.service;

import br.com.cod3r.springboot.model.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericService<T> {
    private final GenericRepository<T> repository;

    @Autowired
    public GenericService(GenericRepository<T> repository) {
        this.repository = repository;
    }

    public T add(T t){
        return repository.save(t);
    }

    public Iterable<T> getAll(){
        return repository.findAll();
    }
}
