package persons.leaders;

import persons.Leader;
import locations.Keyser;


public class KingCarl extends Leader {
	private static KingCarl t;
	
	private KingCarl() {
		super("King Carl",
				"The enlightened despot of Keyser",
				Keyser.getKeyser(),
				"Greetings.  Do you know anyone good at solving mysteries?",
				"To the charriot!");
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
}
