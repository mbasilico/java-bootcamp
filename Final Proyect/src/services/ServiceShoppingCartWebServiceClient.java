package services;

import product.Product;
import shoppingCart.ShoppingCart;
import catalogue.Catalogue;
import client.Client;

public class ServiceShoppingCartWebServiceClient implements ServiceShoppingCart {
	
	ServiceShoppingCart webService;	

	protected ServiceShoppingCartWebServiceClient() {
		// webService = some code
	}

	@Override
	public ShoppingCart createCart() {
		return webService.createCart();
	}

	@Override
	public Catalogue getCatalogue() {
		return webService.getCatalogue();
	}

	@Override
	public Product getProductFromCatalogue(Catalogue catalogue, String id) {
		return webService.getProductFromCatalogue(catalogue, id);
	}

	@Override
	public void addProductToCart(ShoppingCart shoppingCart, Product product) {
		webService.addProductToCart(shoppingCart, product);

	}

	@Override
	public void removeProductFromCart(ShoppingCart shoppingCart, Product product) {
		webService.removeProductFromCart(shoppingCart, product);

	}

	@Override
	public void pay(ShoppingCart shoppingCart, Client client) {
		webService.pay(shoppingCart, client);

	}

	@Override
	public Client createClient() {
		return webService.createClient();
	}

	@Override
	public Client getClient(String name, String password) {
		return webService.getClient(name, password);
	}

}
