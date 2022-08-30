package com.ventas.springboot.ventas.service;

import java.util.List;
import java.util.Optional;



public interface ICrudService<T> {

	List<T> findAll();
	
	Optional<T> FinById(Integer id);
	
	T Create(T model);
	
	T Update(T model);
	
	void Delete(Integer id);
}
