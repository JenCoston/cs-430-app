package locations;

public class Edenborough extends Location {
	private static Edenborough t;
	
	private Edenborough() {
		super("Edenborough", "A proud land with a rainy climate");
	}
	
	public static Edenborough getEdenborough() {
		if (t==null)
			t = new Edenborough();
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
