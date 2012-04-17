package locations;


public class Wallaby extends Location {
	private static Wallaby t;
	
	private Wallaby() {
		super("Wallaby", "A warm state with pyramids lining the outskirts ");
	}
	
	public static Wallaby getWallaby() {
		if (t==null)
			t = new Wallaby();
		return t;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

}
