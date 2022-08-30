package com.ventas.springboot.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.springboot.ventas.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{

}
