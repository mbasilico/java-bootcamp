package shoppingCart;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import product.ConsoleProductBuilder;
import product.Product;
import product.ProductBuilder;
import product.ProductDirector;

public class TestShoppingCart {

	@Test
	public void testEmptyShoppingCart() {
		ShoppingCartDirector cartDirector = new ShoppingCartDirector();
		ShoppingCartBuilder cart1 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(cart1);
		cartDirector.constructCart();
		ShoppingCart shoppingCart = cartDirector.getCart();
		shoppingCart.cart = new ArrayList<Product>();
		
		int empty = shoppingCart.countProducts();
		assertEquals(empty, 0);
				
	}
	
	@Test
	public void testAddProductToShoppingCart() {
		ShoppingCartDirector cartDirector = new ShoppingCartDirector();
		ShoppingCartBuilder cart1 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(cart1);
		cartDirector.constructCart();
		ShoppingCart shoppingCart = cartDirector.getCart();
		shoppingCart.cart = new ArrayList<Product>();
		
		ProductDirector productDirector = new ProductDirector();
		ProductBuilder prod1 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod1);
		productDirector.constructProduct();
		Product product = productDirector.getProduct();
		
		shoppingCart.addProduct(product);
		int count = shoppingCart.countProducts();
				
		assertEquals(count, 1);
				
	}
	
	@Test
	public void testAdd2ProductsToShoppingCart() {
		ShoppingCartDirector cartDirector = new ShoppingCartDirector();
		ShoppingCartBuilder cart1 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(cart1);
		cartDirector.constructCart();
		ShoppingCart shoppingCart = cartDirector.getCart();
		shoppingCart.cart = new ArrayList<Product>();
		
		ProductDirector productDirector = new ProductDirector();
		ProductBuilder prod1 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod1);
		productDirector.constructProduct();
		Product product = productDirector.getProduct();
		
		
		ProductBuilder prod2 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod2);
		productDirector.constructProduct();
		Product product2 = productDirector.getProduct();
		
		shoppingCart.addProduct(product);
		shoppingCart.addProduct(product2);
		int count = shoppingCart.countProducts();
				
		assertEquals(count, 2);				
	}
	
	@Test
	public void testAdd2ProductsToShoppingCartAndCheckTotalPrice() {
		ShoppingCartDirector cartDirector = new ShoppingCartDirector();
		ShoppingCartBuilder cart1 = new ConsoleCartBuilder();
		cartDirector.setShoppingCartBuilder(cart1);
		cartDirector.constructCart();
		ShoppingCart shoppingCart = cartDirector.getCart();
		shoppingCart.cart = new ArrayList<Product>();
		
		ProductDirector productDirector = new ProductDirector();
		ProductBuilder prod1 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod1);
		productDirector.constructProduct();
		Product product = productDirector.getProduct();
		
		
		ProductBuilder prod2 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod2);
		productDirector.constructProduct();
		Product product2 = productDirector.getProduct();
		
		shoppingCart.addProduct(product);
		shoppingCart.addProduct(product2);
		
		int total = (int) shoppingCart.totalPrice();
		double compare = 50;
		int compare2 = (int) compare;
		assertEquals(total, compare2);				
	}

}
