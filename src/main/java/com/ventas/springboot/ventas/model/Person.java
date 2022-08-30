package com.ventas.springboot.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PERid; 
	
	
	@NotNull(message = "El nombre no debe ser nulo")
	@NotBlank(message = "El nombre es obligatorio")
	@Size(min = 3, max = 70, message = "El nombre debe ser mayor a 3 caracteres")
	@Column(name = "PERNames", nullable = false, length = 70)
	private String PERNames;
	
	@NotNull
	@NotBlank(message = "Los apellidos es obligatorio")
	@Size(min = 3, max = 150, message = "Los apellidos deben ser mayor a 3 caracteres")
	@Column(name = "PERLastnames", nullable = false, length = 150)
	private String PERLastnames;
	
	@Size(max = 150, message = "La dirección no debe superar los 150 caracteres")
	@Column( nullable = true, length = 150)
	private String PERAdress;
	
	@Size(min = 10, message = "El telefono debe tener 10 digitos")
	@Column(nullable = true, length = 10)
	private String PERPhone;
	
	public Integer getPERid() {
		return PERid;
	}

	public void setPERid(Integer pERid) {
		PERid = pERid;
	}

	public String getPERNames() {
		return PERNames;
	}

	public void setPERNames(String pERNames) {
		PERNames = pERNames;
	}

	public String getPERLastnames() {
		return PERLastnames;
	}

	public void setPERLastnames(String pERLastnames) {
		PERLastnames = pERLastnames;
	}

	public String getPERAdress() {
		return PERAdress;
	}

	public void setPERAdress(String pERAdress) {
		PERAdress = pERAdress;
	}

	public String getPERPhone() {
		return PERPhone;
	}

	public void setPERPhone(String pERPhone) {
		PERPhone = pERPhone;
	}
}
