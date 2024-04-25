package java_interface;

public class CdPlayer implements Music {
	
	private String singer;
	private String title;

	public CdPlayer(String singer, String title) {
		System.out.println("===== CD Player =====");
		this.singer = singer;
		this.title = title;
	}

	@Override
	public void play() {
		System.out.printf("CD 플레이어에서 '%s %s' 음악을 재생합니다.", singer, title).println();
	}
	@Override
	public void stop() {
		System.out.printf("CD 플레이어에서 '%s %s' 음악을 정지합니다.", singer, title).println();
	}
	
}

