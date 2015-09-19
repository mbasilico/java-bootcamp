
public class Pause extends State{
	
	public void doAction(Context context) {
		System.out.println("Player is in pause state");
		context.setState(this);	
	}

}
