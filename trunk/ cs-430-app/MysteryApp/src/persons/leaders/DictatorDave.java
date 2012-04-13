package persons.leaders;

import persons.Leader;
import locations.Dislexia;


public class DictatorDave extends Leader {
	private static DictatorDave t;
	
	private DictatorDave() {
		super("Dictator Dave",
				"The sole holder of Dislexian authority",
				Dislexia.getDislexia(),
				"Interesting situation here...",
				"Did you ask some of the common folk!");
	}
	
	public static DictatorDave getDictatorDave() {
		if (t==null)
			t = new DictatorDave();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}
}
