package locations;

public class Dislexia extends Location {
	private static Dislexia t;
	
	private Dislexia() {
		super("Dislexia", "A bleak and cold country");
	}
	
	public static Dislexia getDislexia() {
		if (t==null)
			t = new Dislexia();
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
