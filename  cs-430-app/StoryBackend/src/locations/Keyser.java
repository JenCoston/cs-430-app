package locations;

public class Keyser extends Location {
	private static Keyser t;
	
	private Keyser() {
		super("Keyser", "A densely forested kingdom with many rivers");
	}
	
	public static Keyser getKeyser() {
		if (t==null)
			t = new Keyser();
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
