package shoppingcart.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import shoppingcart.model.Item;
import shoppingcart.model.PaymentStrategy;
@Service
public class ShoppingCartService {

	public ArrayList<Item> getCart(int idcart) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addItemToCart(int idcart, Item i) {
		// TODO Auto-generated method stub
		
	}

	public void removeItemInCart(int idcart, int iditem) {
		// TODO Auto-generated method stub
		
	}

	public Item payCart(int idcart, PaymentStrategy pay) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Item> deleteCart(int idcart) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Item> saveCart(int idcart) {
		// TODO Auto-generated method stub
		return null;
	}

}
