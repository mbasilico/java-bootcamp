package shoppingcart.services;

import java.util.ArrayList;
import java.util.List;

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
	
	public void addItemToCart(Long cartID, Long itemID) {
		ShoppingCart cart = new ShoppingCart(); 
		cart = SCartDao.findOne(cartID);
		Item i= new Item(); 
		i=itemsDao.findOne(itemID);
		cart.getCart().add(i);
		SCartDao.save(cart);
	}

	public void removeItemInCart(Long idcart, Long itemID) {
		ShoppingCart cart = new ShoppingCart(); 
		cart = SCartDao.findOne(idcart);
		Item i= new Item(); 
		i=itemsDao.findOne(itemID);
		cart.getCart().remove(i);
		SCartDao.save(cart);
		
	}

	public double payCart(Long cartid, PaymentStrategy payMethod) {
		ShoppingCart s = new ShoppingCart();
		s= SCartDao.findOne(cartid);
		
		return s.pay(payMethod);
	}

	public ArrayList<Item> deleteCart(Long idcart) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Item> saveCart(Long idcart) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> getCart(Long idcart) {
		return SCartDao.findOne(idcart).getCart();
	}

	public void newCart() {
		SCartDao.save(new ShoppingCart());
	}


}
