package locations;

public class Ambrosia extends Location {
	private static Ambrosia t;
	
	private Ambrosia() {
		super("Ambrosia", "A beautful region with a tropical climate");
	}
	
	public static Ambrosia getAmbrosia() {
		if (t==null)
			t = new Ambrosia();
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
