package com.ventas.springboot.ventas.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PROId; 
	
	@Column(length = 15)
	private String PROCode;
	
	@Column(length = 150)
	private String PROName;
	
	@Column()
	private Double PROPrice;
	
	@ManyToOne
	@JoinColumn(name = "tpid", nullable = false)
	private ProductType productType;

	public Integer getPROId() {
		return PROId;
	}

	public void setPROId(Integer pROId) {
		PROId = pROId;
	}

	public String getPROCode() {
		return PROCode;
	}

	public void setPROCode(String pROCode) {
		PROCode = pROCode;
	}

	public String getPROName() {
		return PROName;
	}

	public void setPROName(String pROName) {
		PROName = pROName;
	}

	public Double getPROPrice() {
		return PROPrice;
	}

	public void setPROPrice(Double pROPrice) {
		PROPrice = pROPrice;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PROId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(PROId, other.PROId);
	}
	
	
}
