package com.ventas.springboot.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.springboot.ventas.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer>{

}
