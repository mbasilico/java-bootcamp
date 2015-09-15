package exercices.topic1.ex7;

public class StopState implements AudioPlayerState {

	@Override
	public String play() {
		return "Playing  music";
		
	}

	@Override
	public String stop() {
		return "You already stopped the music!!";
	}

	@Override
	public String pause() {
		return "You can´t pause music, please press play first";
	}

}
