package br.com.cod3r.springboot.model.service.impl;

import br.com.cod3r.springboot.model.entity.Person;
import br.com.cod3r.springboot.model.repository.IPersonRepository;
import br.com.cod3r.springboot.model.service.IPersonService;
import br.com.cod3r.springboot.model.service.generic.IGenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends IGenericServiceImpl<Person, Integer> implements IPersonService {

    @Autowired
    private IPersonRepository repository;

    public PersonServiceImpl(IPersonRepository repository) {
        super(repository);
    }
}
