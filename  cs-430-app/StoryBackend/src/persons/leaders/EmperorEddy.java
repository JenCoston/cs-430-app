package persons.leaders;

import persons.Leader;
import locations.Orient;


public class EmperorEddy extends Leader {
	private static EmperorEddy t;
	
	private EmperorEddy() {
		super("Emperor Eddy", Orient.getOrient());
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

	@Override
	public void converse() {
		// TODO Auto-generated method stub
		
	}
}
