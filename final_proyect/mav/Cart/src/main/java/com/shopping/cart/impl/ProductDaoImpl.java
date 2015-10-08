package com.shopping.cart.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.cart.dao.ProductDao;
import com.shopping.cart.main.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProduct(int productId) {
		return sessionFactory.getCurrentSession().createQuery("from Product p where p.id= :pId").setParameter("pId",productId).list();
	}

	@Override
	public String getProduct(String name) {
		
		
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		Product product = (Product) sessionFactory.getCurrentSession().load(Product.class, id);
		if (null != product) {
            sessionFactory.getCurrentSession().delete(product);}
		
	}

	@Override
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> searchName(String name)  {
		return sessionFactory.getCurrentSession().createQuery("from Product p where p.name like :uName").setParameter("uName","%" + name + "%").list();
	}

}
