package persons;

public class ChancellorChuck extends NPC {
	private static ChancellorChuck t;
		
	private ChancellorChuck() {
		super("Chancellor Chuck of Concordia");
	}
		
	public static ChancellorChuck getChancellorChuck() {
		if (t==null)
			t = new ChancellorChuck();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void converse() {
		// TODO Auto-generated method stub
		
	}
}

