package com.ventas.springboot.ventas.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer VEId; 
	
	@Column()
	private LocalDate VEDate;
	
	
	@ManyToOne
	@JoinColumn(name = "cliid", nullable = false)
	private Cliente cliente;
	
	@OneToMany(mappedBy = "venta", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
	private List<DetailVenta> detalleVentaList;


	public Integer getVEId() {
		return VEId;
	}


	public void setVEId(Integer vEId) {
		VEId = vEId;
	}


	public LocalDate getVEDate() {
		return VEDate;
	}


	public void setVEDate(LocalDate vEDate) {
		VEDate = vEDate;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(VEId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return Objects.equals(VEId, other.VEId);
	}
	
	

	
	
}
