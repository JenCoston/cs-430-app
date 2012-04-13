package persons.leaders;

import persons.Leader;
import locations.Scimitar;

public class SultanSam extends Leader {
	private static SultanSam t;
	
	private SultanSam() {
		super("Sultan Sam",
				"The Scimitar governing head",
				Scimitar.getScimitar(),
				"Greetings.  We could use some help sorting this out.",
				"Ask Abu!");
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

}
