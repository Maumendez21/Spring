package com.ventas.springboot.ventas.model;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Client")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CLIID;
	
	@Column(length = 20)
	private String CLINit;
	
	@Column(length = 100)
	private String CLIRazonSocial;
	
	@NotNull
	@NotBlank(message = "El email es obligatorio")
	@Size(min = 10, max = 100, message = "EL email de ser de al menos 10 caracteres")
	@Email(message = "Ingresa un formáto valido de email")
	@Column(nullable = false, length = 100)
	private String CLIEmail;
	
	@OneToOne
	@JoinColumn(name = "perid", nullable = false)
	private Person CLIId_person;
	
	public Integer getCLIID() {
		return CLIID;
	}
	
	public void setCLIID(Integer CLIID) {
		this.CLIID = CLIID;
	}
	
		
	public String getCLIEmail() {
		return CLIEmail;
	}
	
	public Person getCLIId_person() {
		return CLIId_person;
	}

	public void setCLIId_person(Person cLIId_person) {
		CLIId_person = cLIId_person;
	}

	public String getCLINit() {
		return CLINit;
	}

	public void setCLINit(String cLINit) {
		CLINit = cLINit;
	}

	public String getCLIRazonSocial() {
		return CLIRazonSocial;
	}

	public void setCLIRazonSocial(String cLIRazonSocial) {
		CLIRazonSocial = cLIRazonSocial;
	}

	public void setCLIEmail(String CLIEmail) {
		this.CLIEmail = CLIEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CLIID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(CLIID, other.CLIID);
	}
	
	
	
	
}
