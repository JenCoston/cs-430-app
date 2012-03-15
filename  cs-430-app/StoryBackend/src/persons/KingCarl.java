package persons;


public class KingCarl extends NPC {
	private static KingCarl t;
	
	private KingCarl() {
		super("King Carl of Keyser");
	}
	
	public static KingCarl getKingCarl() {
		if (t==null)
			t = new KingCarl();
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
