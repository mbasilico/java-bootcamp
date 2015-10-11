package com.shopping.cart.dao;

import java.util.List;

import com.shopping.cart.main.Product;

public interface ProductDao {
	public List<Product> getAllProducts();
	public List<Product> getProduct(int productId);
	public String getProduct(String name);
	public void deleteProduct(int productId);
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public List<Product> searchName(String name);
}
