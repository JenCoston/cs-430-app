package persons.leaders;

import persons.Leader;
import locations.Ambrosia;

public class AmbassadorAmber extends Leader {
	private static AmbassadorAmber t;
		
	private AmbassadorAmber() {
		super("Ambassador Amber", Ambrosia.getAmbrosia());
		setDescriptions("A dignified Ambrosian leader");
		setDialog("Good day!  Quite a mess, this murder bit.");
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

	@Override
	public String converse() {
		//for now
		//String hint = "I hope they don't trace me to this murder!";
		//return hint;
		return getDialog();
	}
}
