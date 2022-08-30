package com.ventas.springboot.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.springboot.ventas.model.ProductType;

public interface IProductTypeRepository extends JpaRepository<ProductType, Integer> {

}
