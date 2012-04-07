package locations;

public class Pacifica extends Location {
	private static Pacifica t;
	
	private Pacifica() {
		super("Pacifica", "A warm, sunny nation in the west");
	}
	
	public static Pacifica getPacifica() {
		if (t==null)
			t = new Pacifica();
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
