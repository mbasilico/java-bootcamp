package exercices.topic1.ex1;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MarketManager implements Observer {

	Observable observable;
	List<String> msg;

	public MarketManager(Observable observable) {

		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	// I used instanceof to know who is the observable that change
	// and add msg to mailing(msg) list
	public void update(Observable obs, Object obj) {
		if (obs instanceof ShoppingCart) {
			msg.add("New transaction");
		}
		if (obs instanceof ItemsManager) {
			msg.add((String) obj);
		}
	}

}
