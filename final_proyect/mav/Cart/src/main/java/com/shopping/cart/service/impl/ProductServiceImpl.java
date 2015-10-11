package com.shopping.cart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.cart.dao.ProductDao;
import com.shopping.cart.main.Product;
import com.shopping.cart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Transactional
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
		
	}


	@Transactional
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Transactional
	public List<Product> getProduct(int productId) {
		
		return productDao.getProduct(productId);}
	
	@Transactional
	public List<Product> getProductList() {
		
		return productDao.getAllProducts();
	}


	@Transactional
	public List<Product> searchName(String name)  {
		
		return productDao.searchName(name);
	}
	
	
	
}
