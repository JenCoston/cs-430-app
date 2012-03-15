package persons;

import locations.Ambrosia;

public class AmbassadorAmber extends NPC {
	private static AmbassadorAmber t;
		
	private AmbassadorAmber() {
		super("Ambassador Amber", Ambrosia.getAmbrosia());
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
	public void converse() {
		// TODO Auto-generated method stub
		
	}
}
