package game;

import persons.Player;

public class Game {
	private static Game game;
	private int state;
	private World world;
	private Story story;
	private Player player;
	
	private Game() {
		world = World.getWorld();
		story = Story.getStory();
		player = Player.getPlayer();
	}
	
	public static Game getGame() {
		if (game==null)
			game = new Game();
		return game;
	}
	
	public void play() {
		
	}
	
	public void loadGame() {
		
	}
	
	public void newGame() {
		
	}
	
	public void showIntro(){}
	
	public void printAll() {
		story.printMurder();
		System.out.println();
		world.printWorld();
	}
}
