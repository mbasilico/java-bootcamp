
public class Play extends State{
	
	public void doAction(Context context) {
	      System.out.println("Player is playing a song");
	      context.setState(this);	
	   }

}
