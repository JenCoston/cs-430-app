package persons.leaders;

import persons.Leader;
import locations.Ambrosia;

public class AmbassadorAmber extends Leader {
	private static AmbassadorAmber t;
		
	private AmbassadorAmber() {
		super("Ambassador Amber", 
				"A dignified Ambrosian leader",
				Ambrosia.getAmbrosia(),
				"Good day!  Quite a mess, this murder bit.",
				"I hope they don't trace me to this murder!");
	}
		
	public static AmbassadorAmber getAmbassadorAmber() {
		if (t==null)
			t = new AmbassadorAmber();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}
}
