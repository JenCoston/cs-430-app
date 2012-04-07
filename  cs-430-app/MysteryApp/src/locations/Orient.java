package locations;

public class Orient extends Location {
	private static Orient t;
	
	private Orient() {
		super("Orient", "A storied land in the far east");
	}
	
	public static Orient getOrient() {
		if (t==null)
			t = new Orient();
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
