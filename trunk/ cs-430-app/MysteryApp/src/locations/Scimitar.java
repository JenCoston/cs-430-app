package locations;

public class Scimitar extends Location {
	private static Scimitar t;
	
	private Scimitar() {
		super("Scimitar", "A vast nation surrounded by a guardian wall");
	}
	
	public static Scimitar getScimitar() {
		if (t==null)
			t = new Scimitar();
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
