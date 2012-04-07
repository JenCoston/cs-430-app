package persons.leaders;

import persons.Leader;
import locations.Wallaby;

public class PharaohFineas extends Leader {
	private static PharaohFineas t;
	
	private PharaohFineas() {
		super("Pharaoh Fineas", Wallaby.getWallaby());
		setDescriptions("The stoic Wallabian head of state");
		setDialog("Hello.");
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
	public String converse() {
		// TODO Auto-generated method stub
		String hint = "It's too warm out here, can we please talk in my pyramid!";
		return hint;
		
	}

}
