package com.entities;

public class Services implements java.io.Serializable {

	/**
	 * ID, Name, Type (Subscription, Alacarte), Operator ID, Operator Service ID, Operator Package ID, …
	 */
	private static final long serialVersionUID = 1L;
	
	private Product product;
	
	private Integer servicesID;
	
	private String name;

	private String operatorPackageID;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getServicesID() {
		return servicesID;
	}

	public void setServicesID(Integer servicesID) {
		this.servicesID = servicesID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperatorPackageID() {
		return operatorPackageID;
	}

	public void setOperatorPackageID(String operatorPackageID) {
		this.operatorPackageID = operatorPackageID;
	}
	
}
