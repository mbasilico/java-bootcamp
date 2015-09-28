package services;

import product.Product;
import shoppingCart.ShoppingCart;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import catalogue.Catalogue;
import client.Client;

@Controller
@EnableAutoConfiguration
public class ServiceShoppingCartWebServiceClient implements ServiceShoppingCart {
	
	ServiceShoppingCart webService;	

	protected ServiceShoppingCartWebServiceClient() {
		// webService = some code
	}
	@RequestMapping(value ="/createCart", method = RequestMethod.POST)
	@Override
	public ShoppingCart createCart() {
		return webService.createCart();
	}
	@RequestMapping(value ="/getCatalogue", method = RequestMethod.GET)
	@Override
	public Catalogue getCatalogue() {
		return webService.getCatalogue();
	}
	@RequestMapping(value ="/getProductFromCatalogue", method = RequestMethod.GET)
	@Override
	public Product getProductFromCatalogue(Catalogue catalogue, String id) {
		return webService.getProductFromCatalogue(catalogue, id);
	}
	@RequestMapping(value ="/addProductToCart", method = RequestMethod.PUT)
	@Override
	public void addProductToCart(ShoppingCart shoppingCart, Product product) {
		webService.addProductToCart(shoppingCart, product);
	}
	@RequestMapping(value ="/removeProductFromCart", method = RequestMethod.DELETE)
	@Override
	public void removeProductFromCart(ShoppingCart shoppingCart, Product product) {
		webService.removeProductFromCart(shoppingCart, product);
	}
	@RequestMapping(value ="/pay", method = RequestMethod.POST)
	@Override
	public void pay(ShoppingCart shoppingCart, Client client) {
		webService.pay(shoppingCart, client);
	}
	@RequestMapping(value ="/createClient", method = RequestMethod.POST)
	@Override
	public Client createClient() {
		return webService.createClient();
	}
	@RequestMapping(value ="/getClient", method = RequestMethod.GET)
	@Override
	public Client getClient(String name, String password) {
		return webService.getClient(name, password);
	}

}
