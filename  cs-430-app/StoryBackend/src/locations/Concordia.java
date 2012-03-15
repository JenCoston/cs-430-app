package locations;

public class Concordia extends Location {
	private static Concordia t;
	
	private Concordia() {
		super("Concordia", "A ");
	}
	
	public static Concordia getConcordia() {
		if (t==null)
			t = new Concordia();
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
