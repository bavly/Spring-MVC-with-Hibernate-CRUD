package com.servicesapi;

import java.util.List;

import com.entities.Product;

public interface ProductService {
	public boolean saveOrUpdate(Product product);
	public List<Product> list();
	public boolean delete(Product product);
}
