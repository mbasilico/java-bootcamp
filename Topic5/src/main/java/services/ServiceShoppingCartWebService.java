package services;

import product.Product;
import shoppingCart.ShoppingCart;
import catalogue.Catalogue;
import client.Client;

public class ServiceShoppingCartWebService implements ServiceShoppingCart {
	
	ServiceShoppingCart imp = new ServiceShoppingCartImp();

	@Override
	public ShoppingCart createCart() {
		return imp.createCart();
	}

	@Override
	public Catalogue getCatalogue() {
		return imp.getCatalogue();
	}

	@Override
	public Product getProductFromCatalogue(Catalogue catalogue, String id) {
		return imp.getProductFromCatalogue(catalogue, id);
	}

	@Override
	public void addProductToCart(ShoppingCart shoppingCart, Product product) {
		imp.addProductToCart(shoppingCart, product);
	}

	@Override
	public void removeProductFromCart(ShoppingCart shoppingCart, Product product) {
		imp.removeProductFromCart(shoppingCart, product);
	}

	@Override
	public void pay(ShoppingCart shoppingCart, Client client) {
		imp.pay(shoppingCart, client);
	}

	@Override
	public Client createClient() {
		return imp.createClient();
	}

	@Override
	public Client getClient(String name, String password) {
		return imp.getClient(name, password);
	}

}
