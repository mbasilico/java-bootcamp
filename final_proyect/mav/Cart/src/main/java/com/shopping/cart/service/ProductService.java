package com.shopping.cart.service;

import java.util.List;

import com.shopping.cart.main.Product;

public interface ProductService {
	public List<Product> getProductList();
	public void deleteProduct(int productId);
	public void addProduct(Product product);
	public List<Product> searchName(String name);
	public List<Product> getProduct(int productId);

}
