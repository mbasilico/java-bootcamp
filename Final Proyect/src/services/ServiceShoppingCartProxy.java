package services;

import product.Product;
import shoppingCart.ShoppingCart;
import catalogue.Catalogue;
import client.Client;

public class ServiceShoppingCartProxy implements ServiceShoppingCart {
	
	ServiceShoppingCart implementation;	

	protected ServiceShoppingCartProxy(ServiceShoppingCart imp) {
		this.implementation = imp;
	}

	@Override
	public ShoppingCart createCart() {
		return implementation.createCart();
	}

	@Override
	public Catalogue getCatalogue() {
		return implementation.getCatalogue();
	}

	@Override
	public Product getProductFromCatalogue(Catalogue catalogue, String id) {
		return implementation.getProductFromCatalogue(catalogue, id);
	}

	@Override
	public void addProductToCart(ShoppingCart shoppingCart, Product product) {
		implementation.addProductToCart(shoppingCart, product);
	}

	@Override
	public void removeProductFromCart(ShoppingCart shoppingCart, Product product) {
		implementation.removeProductFromCart(shoppingCart, product);
	}

	@Override
	public void pay(ShoppingCart shoppingCart, Client client) {
		implementation.pay(shoppingCart, client);
	}

	@Override
	public Client createClient() {
		return implementation.createClient();
	}

	@Override
	public Client getClient(String name, String password) {
		return implementation.getClient(name, password);
	}

}
