package locations;

public class Peoria extends Location {
	private static Peoria t;
	
	private Peoria() {
		super("Peoria", "A lively nation of forests and natural resources");
	}
	
	public static Peoria getPeoria() {
		if (t==null)
			t = new Peoria();
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
