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
				"I hope they don't try to pin me to this murder!",
				"My land is far too safe for an incident like this to happen here.",
				"Do you have any leads?"
		);
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
