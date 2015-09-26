package finalproyect;

import payment.PaymentFactory;
import product.ConsoleProductBuilder;
import product.Product;
import product.ProductBuilder;
import product.ProductDirector;
import shoppingCart.ConsoleCartBuilder;
import shoppingCart.ShoppingCart;
import shoppingCart.ShoppingCartBuilder;
import shoppingCart.ShoppingCartDirector;
import catalogue.Catalogue;
import catalogue.CatalogueBuilder;
import catalogue.CatalogueDirector;
import catalogue.ConsoleCatalogueBuilder;
import client.Client;
import client.ClientBuilder;
import client.ClientDirector;
import client.ConsoleClientBuilder;

public class MainShop {

	public static void main(String[] args) {

		ClientDirector clientDirector = new ClientDirector();
		ClientBuilder clientBuilder = new ConsoleClientBuilder();
		clientDirector.setClientBuilder(clientBuilder);
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
		ShoppingCartBuilder shoppingCartBuilder = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(shoppingCartBuilder);
		cartDirector.constructCart();
		ShoppingCart shoppingCart = cartDirector.getCart();

		ShoppingCartBuilder shoppingCartBuilder2 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(shoppingCartBuilder2);
		cartDirector.constructCart();
		ShoppingCart shoppingCart2 = cartDirector.getCart();		

		shoppingCart.addProduct(product);
		System.out.println("cartID: " + shoppingCart2.getCartID());
		System.out.println(shoppingCart.showProducts());
		//System.out.println("removing product " + product.toString());
		//shoppingCart.removeProductFromCart(product);
		System.out.println(shoppingCart.showProducts());

		CatalogueBuilder catalogue1 = new ConsoleCatalogueBuilder();
		CatalogueDirector catalogueDirector = new CatalogueDirector();
		catalogueDirector.setCatalogueBuilder(catalogue1);
		catalogueDirector.constructCatalogue();
		Catalogue catalogue = catalogueDirector.getCatalogue();
		
		System.out.println("normal or offer? " + catalogue.getType());

		catalogue.addProduct(product);
		System.out.println("catalogue");
		System.out.println(catalogue.showProducts());

		PaymentFactory.getPayment(shoppingCart, client);
	}
}
