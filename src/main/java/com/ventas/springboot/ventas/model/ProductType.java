package com.ventas.springboot.ventas.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer TPId; 
	
	@Column(length = 15)
	private String TPCode;
	
	@Column(length = 15)
	private String TPName;

	public Integer getTPId() {
		return TPId;
	}

	public void setTPId(Integer tPId) {
		TPId = tPId;
	}

	public String getTPCode() {
		return TPCode;
	}

	public void setTPCode(String tPCode) {
		TPCode = tPCode;
	}

	public String getTPName() {
		return TPName;
	}

	public void setTPName(String tPName) {
		TPName = tPName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TPId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductType other = (ProductType) obj;
		return Objects.equals(TPId, other.TPId);
	}
	
	

}
