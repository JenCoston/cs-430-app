package persons.leaders;

import persons.Leader;
import locations.Orient;


public class EmperorEddy extends Leader {
	private static EmperorEddy t;
	
	private EmperorEddy() {
		super("Emperor Eddy",
				"Orient's fearless ruler",
				Orient.getOrient(),
				"Hello.  What a complication this is!",
				"Excuse me but it's about time for the cricket match!");
	}
	
	public static EmperorEddy getEmperorEddy() {
		if (t==null)
			t = new EmperorEddy();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}
}
