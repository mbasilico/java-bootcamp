package exercices.topic1.ex7;

public class AudioPlayer implements AudioPlayerState {

	AudioPlayerState AudioState;

	public AudioPlayer(AudioPlayerState audioState) {
		this.AudioState = audioState;
	}
	
	public void setAudioPlayerState (AudioPlayerState audioState){
		this.AudioState = audioState;
	}

	@Override
	public String play() {
		return AudioState.play();
	}

	@Override
	public String stop() {
		return AudioState.stop();
	}

	@Override
	public String pause() {
		return AudioState.pause();
	}

}
