package com.ventas.springboot.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.springboot.ventas.model.Venta;

public interface IVentaRepository extends JpaRepository<Venta, Integer> {

}
