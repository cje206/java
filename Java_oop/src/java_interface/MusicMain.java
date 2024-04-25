package java_interface;

public class MusicMain {
	public void musicPlayer(Music player) {
		player.play();
		player.stop();
	}

	public static void main(String[] args) {
		MusicMain music = new MusicMain();
		
		Music mp3 = new Mp3Player("아이유", "블루밍");
		music.musicPlayer(mp3);
		
		Music cd = new CdPlayer("아이유", "꽃갈피");
		music.musicPlayer(cd);
	}

}
