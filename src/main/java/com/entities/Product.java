package com.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 /* 
  * ID, Name, Description, Min Price, Max Price. 
 
 */
public class Product implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer productID;
	
	private String productName;

	private String  minPrice;
	
	private String  maxPrice;
	
	private Set<Services> productServicesID =
			new HashSet<Services>(0);

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Set<Services> getProductServicesID() {
		return productServicesID;
	}

	public void setProductServicesID(Set<Services> productServicesID) {
		this.productServicesID = productServicesID;
	}
	
	
}
