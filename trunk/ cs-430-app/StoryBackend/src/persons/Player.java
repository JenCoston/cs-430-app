package persons;


public class Player extends Person {
	private static Player p;
	
	private Player() {
		super("");
	}
	
	public void setUpPlayer(String name) {
		getPlayer().setName(name);
	}
	
	public static Player getPlayer() {
		if (p==null)
			p = new Player();
		return p;
	}

}
