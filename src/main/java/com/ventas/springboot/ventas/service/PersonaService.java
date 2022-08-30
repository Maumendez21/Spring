package com.ventas.springboot.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.springboot.ventas.model.Cliente;
import com.ventas.springboot.ventas.model.Person;
import com.ventas.springboot.ventas.repository.IPersonRepository;


@Service
public class PersonaService implements ICrudService<Person> {

	@Autowired
	private IPersonRepository _personRepository;
	
	
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return _personRepository.findAll();
	}

	@Override
	public Optional<Person> FinById(Integer id) {
		// TODO Auto-generated method stub
		return _personRepository.findById(id);
	}

	@Override
	public Person Create(Person persona) {
		// TODO Auto-generated method stub
		return _personRepository.save(persona);
	}

	@Override
	public Person Update(Person persona) {
		// TODO Auto-generated method stub
		
		return _personRepository.save(persona);
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		_personRepository.deleteById(id);
	}

}
