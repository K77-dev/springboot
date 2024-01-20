package br.com.cod3r.springboot.model.service;


import br.com.cod3r.springboot.model.entity.Person;
import br.com.cod3r.springboot.model.service.generic.IGenericService;

public interface IPersonService extends IGenericService<Person, Integer> {}