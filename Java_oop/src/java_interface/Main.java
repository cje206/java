package java_interface;

public class Main {

	public static void main(String[] args) {
//		DiabloGame game = new DiabloGame();
//		LoLGame game = new LoLGame();
		
//		GameConsole game = new DiabloGame();
//		GameConsole game = new LoLGame();
		
//		game.up();
//		game.down();
//		game.right();
//		game.left();
//		game.spacebar();
		
//		GameConsole.staicPrint();

		GameConsole game1 = new DiabloGame();
		GameConsole game2 = new LoLGame();
		GameConsole[] games = {game1, game2};
		
		for( GameConsole game: games ) {
			game.up();
			game.down();
			game.right();
			game.left();
			game.spacebar();
		}
		
		Music mp3 = new Mp3Player("아이유", "블루밍");
		mp3.play();
		mp3.stop();	
		
		Music cd = new CdPlayer("아이유", "꽃갈피");
		cd.play();
		cd.stop();	
		
		
	}

}
