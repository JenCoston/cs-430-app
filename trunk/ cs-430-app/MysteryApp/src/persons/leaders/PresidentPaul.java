package persons.leaders;

import persons.Leader;
import locations.Pacifica;


public class PresidentPaul extends Leader {
	private static PresidentPaul t;
	
	private PresidentPaul() {
		super("President Paul",
				"The charismatic chief executive of Pacifica",
				Pacifica.getPacifica(),
				"Well hello there!  Now what do you think of all this?",
				"Don't worry, I will find out who the culprit is!",
				"Well I certainly wasn't involved."
		);
	}
	
	public static PresidentPaul getPresidentPaul() {
		if (t==null)
			t = new PresidentPaul();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}
}
