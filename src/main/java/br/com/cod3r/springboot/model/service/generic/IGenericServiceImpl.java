package br.com.cod3r.springboot.model.service.generic;

import br.com.cod3r.springboot.model.repository.IGenericRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class IGenericServiceImpl<T, ID> implements IGenericService<T, ID> {

    private final IGenericRepository<T, ID> repository;

    public IGenericServiceImpl(IGenericRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(ID id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<T> getAll() {
        return repository.findAll();
    }

}