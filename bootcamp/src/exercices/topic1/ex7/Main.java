package exercices.topic1.ex7;

public class Main {

	public static void main(String[] args) {
		
		AudioPlayer player = new AudioPlayer(new StopState());
		System.out.println("Player stop in stop state: " + player.stop());
		System.out.println("Player pause in stop state: " + player.pause());
		System.out.println("Player play in stop state: " + player.play());
		
		player.setAudioPlayerState(new PlayState());
		System.out.println("Player play in play state: " + player.play());
		System.out.println("Player pause in play state: " + player.pause());
		System.out.println("Player stop in stop state: " + player.stop());
		
		player.setAudioPlayerState(new PauseState());
		System.out.println("Player pause in pause state: " + player.pause());
		System.out.println("Player stop in pause state: " + player.stop());
		System.out.println("Player play in pause state: " + player.play());
	}

}
