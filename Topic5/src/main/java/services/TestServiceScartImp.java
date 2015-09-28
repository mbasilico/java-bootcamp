package services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories.CategoryFilter;

import product.ConsoleProductBuilder;
import product.Product;
import product.ProductBuilder;
import product.ProductDirector;
import shoppingCart.ConsoleCartBuilder;
import shoppingCart.ShoppingCart;
import shoppingCart.ShoppingCartDirector;

public class TestServiceScartImp {

	@Test
	public void test() {
		ServiceShoppingCartImp serviceCart = new ServiceShoppingCartImp();
		ShoppingCart shoppingCart = serviceCart.createCart();
		ProductDirector productDirector = new ProductDirector();
		ProductBuilder prod1 = new ConsoleProductBuilder();
		productDirector.setProductBuilder(prod1);
		productDirector.constructProduct();
		Product product = productDirector.getProduct();
		
		serviceCart.addProductToCart(shoppingCart, product);
		int itemsCount = shoppingCart.countProducts();
		assertEquals(1, itemsCount);
		
	}

}
