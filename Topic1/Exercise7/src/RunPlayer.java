
public class RunPlayer {

	public static void main(String[] args) {
		Context context = new Context();

	      Play playState = new Play(); //Play button pressed
	      playState.doAction(context);
	      

	      Stop stopState = new Stop(); // Stop button pressed
	      stopState.doAction(context);
	      
	      //Play button pressed
	      playState.doAction(context);

	      Pause pauseState = new Pause(); // Pause button pressed
	      pauseState.doAction(context);
	     

	 }
		

}

