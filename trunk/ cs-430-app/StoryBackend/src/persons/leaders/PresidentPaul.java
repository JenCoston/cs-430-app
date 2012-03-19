package persons.leaders;

import persons.Leader;
import locations.Pacifica;


public class PresidentPaul extends Leader {
	private static PresidentPaul t;
	
	private PresidentPaul() {
		super("President Paul", Pacifica.getPacifica());
	}
	
	public static PresidentPaul getPresidentPaul() {
		if (t==null)
			t = new PresidentPaul();
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
