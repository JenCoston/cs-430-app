package persons.leaders;

import persons.Leader;
import locations.Scimitar;

public class SultanSam extends Leader {
	private static SultanSam t;
	
	private SultanSam() {
		super("Sultan Sam", Scimitar.getScimitar());
	}
		
	public static SultanSam getSultanSam() {
		if (t==null)
			t = new SultanSam();
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
