package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Person;

public interface PersonDAO extends CrudRepository<Person, Long> {

}
