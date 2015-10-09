package shoppingcart.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingcart.DAO.ItemsDAO;
import shoppingcart.DAO.ShoppingCartDAO;
import shoppingcart.model.Item;
import shoppingcart.model.PaymentStrategy;
import shoppingcart.model.ShoppingCart;

@Service
public class ShoppingCartService {
	
	@Autowired
	ShoppingCartDAO SCartDao;

	@Autowired
	ItemsDAO itemsDao;
	
	public void addItemToCart(ShoppingCart cart, Item i) {
		// TODO Auto-generated method stub
		
	}

	public void removeItemInCart(ShoppingCart cart, int iditem) {
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

	public ArrayList<Item> getCart(int idcart) {
		// TODO Auto-generated method stub
		return null;
	}


}
