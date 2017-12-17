package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoapi.ProductDao;

import com.entities.Product;
import com.servicesapi.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	public boolean saveOrUpdate(Product product) {
		return ProductDao.saveOrUpdate(product);
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return ProductDao.list();
	}

	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return ProductDao.delete(product);
	}	
	
}
