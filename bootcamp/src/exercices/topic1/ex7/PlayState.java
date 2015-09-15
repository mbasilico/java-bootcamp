package exercices.topic1.ex7;

public class PlayState implements AudioPlayerState {

	@Override
	public String play() {
		return "You already playing music!!";
	}

	@Override
	public String stop() {
		return "Music Stops";

	}

	@Override
	public String pause() {
		return "Music Pause";

	}

}
