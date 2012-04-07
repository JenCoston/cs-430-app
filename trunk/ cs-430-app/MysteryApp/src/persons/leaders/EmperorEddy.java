package persons.leaders;

import persons.Leader;
import locations.Orient;


public class EmperorEddy extends Leader {
	private static EmperorEddy t;
	
	private EmperorEddy() {
		super("Emperor Eddy", Orient.getOrient());
		setDescriptions("Orient's fearless ruler");
		setDialog("Hello.  What a complication this is!");
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
	public String converse() {
		// TODO Auto-generated method stub
		String hint = "Excuse me but it's about time for the cricket match!";
		return hint;
		
	}
}
