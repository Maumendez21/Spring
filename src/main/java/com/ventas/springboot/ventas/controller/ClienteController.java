package com.ventas.springboot.ventas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.springboot.ventas.model.Cliente;
import com.ventas.springboot.ventas.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		return ResponseEntity.ok(clienteService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findByIds(@PathVariable("id") Integer idCliente){
		return clienteService.FinById(idCliente)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Cliente> create(@Valid @RequestBody Cliente cliente){
		return new ResponseEntity<Cliente>(clienteService.Create(cliente), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> update(@Valid @RequestBody Cliente cliente){
		return clienteService.FinById(cliente.getCLIID())
				.map(c -> ResponseEntity.ok(clienteService.Update(cliente)))
				.orElseGet(( ) -> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable("id") Integer id){
		return clienteService.FinById(id)
				.map(c -> {
					clienteService.Delete(id);
					return ResponseEntity.ok(c);
				})
				.orElseGet(( ) -> ResponseEntity.notFound().build());
	}
	
	
}
