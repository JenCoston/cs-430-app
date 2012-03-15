package locations;

public class Wallaby extends Location {
	private static Wallaby t;
	
	private Wallaby() {
		super("Wallaby", "A sunny state of beaches ");
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
