package com.daoapi;

import java.util.List;

import com.entities.Product;

public interface ProductDao {
	public boolean saveOrUpdate(Product product);
	public List<Product> list();
	public boolean delete(Product product);
}
