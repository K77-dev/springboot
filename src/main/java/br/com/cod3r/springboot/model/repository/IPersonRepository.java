package br.com.cod3r.springboot.model.repository;

import br.com.cod3r.springboot.model.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends IGenericRepository<Person, Integer> {}

