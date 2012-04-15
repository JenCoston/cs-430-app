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
				"To the charriot!",
			    "My chief of staff has assured me that everything is in order. There is nothing for you to see here.",
			    "This land has a long vast history of hosting parties! Killing the guests would dampen the mood.",
			    "If people knew all the fun we have, they would shut us down!",
			    "I'm so popular and so fun... why wouldn't I win?"

		);
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
