package finalproyect;


import java.util.ArrayList;

import payment.PaymentFactory;
import product.ConsoleProductBuilder;
import product.Product;
import product.ProductBuilder;
import product.ProductDirector;
import shoppingCart.ConsoleCartBuilder;
import shoppingCart.ShoppingCart;
import shoppingCart.ShoppingCartBuilder;
import shoppingCart.ShoppingCartDirector;
import client.Client;
import client.ClientBuilder;
import client.ClientDirector;
import client.ConsoleClientBuilder;

public class MainShop {

	public static void main(String[] args) {

		ClientDirector clientDirector = new ClientDirector();
		ClientBuilder cb = new ConsoleClientBuilder();
		clientDirector.setClientBuilder(cb);
		clientDirector.constructClient();
		Client client = clientDirector.getClient();
		System.out.println(client);

		ProductDirector productDirector = new ProductDirector();
		ProductBuilder prod1 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod1);
		productDirector.constructProduct();
		Product product = productDirector.getProduct();
		System.out.println(product);

		ShoppingCartDirector cartDirector = new ShoppingCartDirector();
		ShoppingCartBuilder cart1 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(cart1);
		cartDirector.constructCart();
		ShoppingCart shoppingCart = cartDirector.getCart();
		shoppingCart.cart = new ArrayList<Product>();

		ShoppingCartDirector cartDirector2 = new ShoppingCartDirector();
		ShoppingCartBuilder cart2 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(cart1);
		cartDirector.constructCart();
		ShoppingCart shoppingCart2 = cartDirector.getCart();
		shoppingCart2.cart = new ArrayList<Product>();

		shoppingCart.addProduct(product);
		System.out.println("cartID: " + shoppingCart2.getCartID());
		System.out.println(shoppingCart.showProducts());
		//shoppingCart.deleteProductFromCart(product);
		System.out.println(shoppingCart.showProducts());

		/*CatalogueBuilder catalogue1 = new ConsoleCatalogueBuilder();
		CatalogueDirector catalogueDirector = new CatalogueDirector();
		catalogueDirector.setCatalogueBuilder(catalogue1);
		catalogueDirector.constructCatalogue();
		Catalogue catalogue = catalogueDirector.getCatalogue();

		String type = "";
		// catalogue = new ArrayList<Product>();
		catalogue.setType(type);
		System.out.println("normal or offer? " + type);
		/*
		 * catalogue.addProduct(product); System.out.println("catalogue");		 
		 * catalogue1.showProducts();
		 */
		
		PaymentFactory.getPayment(shoppingCart, client);
	}
}
