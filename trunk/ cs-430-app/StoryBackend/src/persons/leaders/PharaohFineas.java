package persons.leaders;

import persons.Leader;
import locations.Wallaby;

public class PharaohFineas extends Leader {
	private static PharaohFineas t;
	
	private PharaohFineas() {
		super("Pharaoh Fineas", Wallaby.getWallaby());
	}
		
	public static PharaohFineas getPharaohFineas() {
		if (t==null)
			t = new PharaohFineas();
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
