package com.ventas.springboot.ventas.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetailVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer DetVId;
	
	@Column
	private Double DVPrice;
	
	@Column
	private Integer DetVCantidad;
	
	@ManyToOne
	@JoinColumn(name = "proid", nullable = false)
	private Product producto;
	
	@ManyToOne
	@JoinColumn(name = "veid", nullable = false)
	private Venta venta;

	public Integer getDetVId() {
		return DetVId;
	}

	public void setDetVId(Integer detVId) {
		DetVId = detVId;
	}

	public Double getDVPrice() {
		return DVPrice;
	}

	public void setDVPrice(Double dVPrice) {
		DVPrice = dVPrice;
	}

	public Integer getDetVCantidad() {
		return DetVCantidad;
	}

	public void setDetVCantidad(Integer detVCantidad) {
		DetVCantidad = detVCantidad;
	}

	public Product getProducto() {
		return producto;
	}

	public void setProducto(Product producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DetVId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetailVenta other = (DetailVenta) obj;
		return Objects.equals(DetVId, other.DetVId);
	}
	
	
	

	
	
}
