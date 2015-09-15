package exercices.topic1.ex7;

public class PauseState implements AudioPlayerState {

	@Override
	public String play() {
		return "Playing  music";

	}

	@Override
	public String stop() {
		return "Music Stopped!!";

	}

	@Override
	public String pause() {
		return "You already paused the music!!";
		
	}

}
