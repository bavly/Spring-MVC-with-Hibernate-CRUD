package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daoapi.ProductDao;
import com.daoapi.UsersDao;
import com.entities.Product;
import com.entities.Users;


@Repository
@Transactional
public class ProductImpl implements ProductDao{

	@Autowired
	SessionFactory session;
	
	public boolean saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	public List<Product> list() {
		return session.getCurrentSession().createQuery("from Product").list();
	}

	public boolean delete(Product product) {
		try{
			session.getCurrentSession().delete(product);
		}catch(Exception ex){
			return false;
		}
		
		return true;
	}
	
	
}
