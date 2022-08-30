package com.ventas.springboot.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.springboot.ventas.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
