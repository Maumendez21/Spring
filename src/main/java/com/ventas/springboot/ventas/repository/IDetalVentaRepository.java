package com.ventas.springboot.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.springboot.ventas.model.DetailVenta;

public interface IDetalVentaRepository extends JpaRepository<DetailVenta, Integer> {

}
