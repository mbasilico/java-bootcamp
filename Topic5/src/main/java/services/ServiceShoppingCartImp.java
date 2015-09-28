package services;

import payment.PaymentFactory;
import product.Product;
import shoppingCart.ConsoleCartBuilder;
import shoppingCart.ShoppingCart;
import shoppingCart.ShoppingCartDirector;
import catalogue.Catalogue;
import client.Client;
import client.ClientDirector;
import client.ConsoleClientBuilder;

public class ServiceShoppingCartImp implements ServiceShoppingCart {

	protected ServiceShoppingCartImp() {
	}
	
	@Override
	public ShoppingCart createCart() {
		new ShoppingCartDirector().setShoppingCartBuilder(new ConsoleCartBuilder());
		new ShoppingCartDirector().constructCart();
		return new ShoppingCartDirector().getCart();
	}
	
	@Override
	public Catalogue getCatalogue() {
		Catalogue catalogue = new Catalogue();
		catalogue.getCatalogue();
		return catalogue;
	}
	
	@Override
	public Product getProductFromCatalogue(Catalogue catalogue, String id) {
		Product product = catalogue.getProduct(id);
		return product;
	}
	
	@Override
	public void addProductToCart(ShoppingCart shoppingCart, Product product) {
		shoppingCart.addProduct(product);
	}
	
	@Override
	public void removeProductFromCart(ShoppingCart shoppingCart, Product product) {
		shoppingCart.removeProductFromCart(product);
	}
	
	@Override
	public void pay(ShoppingCart shoppingCart, Client client) {
		PaymentFactory.getPayment(shoppingCart, client);
	}
	
	@Override
	public Client createClient() {
		new ClientDirector().setClientBuilder(new ConsoleClientBuilder());
		new ClientDirector().constructClient();
		return new ClientDirector().getClient();
	}
	
	@Override
	public Client getClient(String name, String password) {
		Client client = new Client();
		client.getClient(name, password);
		return client;
	}

}
