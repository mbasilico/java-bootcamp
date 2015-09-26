package services;

import catalogue.Catalogue;
import client.Client;
import product.Product;
import shoppingCart.ShoppingCart;

public interface ServiceShoppingCart {

	public ShoppingCart createCart();

	public Catalogue getCatalogue();

	public Product getProductFromCatalogue(Catalogue catalogue, String id);

	public void addProductToCart(ShoppingCart shoppingCart, Product product);

	public void removeProductFromCart(ShoppingCart shoppingCart, Product product);

	public void pay(ShoppingCart shoppingCart, Client client);

	public Client createClient();

	public Client getClient(String name, String password);

}
