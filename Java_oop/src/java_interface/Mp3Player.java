package java_interface;

public class Mp3Player implements Music {

	private String singer;
	private String title;

	public Mp3Player(String singer, String title) {
		System.out.println("===== MP3 Player =====");
		this.singer = singer;
		this.title = title;
	}

	@Override
	public void play() {
		System.out.printf("MP3 플레이어에서 '%s %s' 음악을 재생합니다.", singer, title).println();
	}

	@Override
	public void stop() {
		System.out.printf("MP3 플레이어에서 '%s %s' 음악을 정지합니다.", singer, title).println();
	}
	
}
