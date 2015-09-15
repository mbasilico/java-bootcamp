
public class Stop extends State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);	
	}

}
