package persons.leaders;

import persons.Leader;
import locations.Wallaby;

public class PharaohFineas extends Leader {
	private static PharaohFineas t;
	
	private PharaohFineas() {
		super("Pharaoh Fineas",
				"The stoic Wallabian head of state",
				Wallaby.getWallaby(),
				"Hello. I hope you can assist us.",
				"It's too warm out here, can we please talk in my pyramid!",
				"I am just glad it wasn't me.",
				"It is high time someone solves this case."
		);
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

}
