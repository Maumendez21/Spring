package com.ventas.springboot.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.springboot.ventas.model.Cliente;
import com.ventas.springboot.ventas.repository.IClienteRepository;

import ch.qos.logback.core.net.server.Client;

@Service
public class ClienteService implements ICrudService<Cliente> {
	
	@Autowired
	private IClienteRepository _clienteRepo;

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return _clienteRepo.findAll();
	}

	@Override
	public Optional<Cliente> FinById(Integer id) {
		// TODO Auto-generated method stub
		return _clienteRepo.findById(id);
	}

	@Override
	public Cliente Create(Cliente cliente) {
		// TODO Auto-generated method stub
		return _clienteRepo.save(cliente);
	}

	@Override
	public Cliente Update(Cliente cliente) {
		// TODO Auto-generated method stub
		return _clienteRepo.save(cliente);
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		_clienteRepo.deleteById(id);
	}




}
