package java_interface;

public class LoLGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("챔피언 변경하기");
	}

	@Override
	public void down() {
		System.out.println("상점으로 이동");
	}

	@Override
	public void right() {
		System.out.println("스킬 변경하기");
	}

	@Override
	public void left() {
		System.out.println("단축키 변경하기");
	}


	@Override
	public void spacebar() {
		System.out.println("채팅방 열리기");
	}
	
}
