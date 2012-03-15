package persons;

import locations.Orient;


public class EmperorEddy extends NPC {
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
