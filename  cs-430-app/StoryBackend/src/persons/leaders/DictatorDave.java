package persons.leaders;

import persons.Leader;
import locations.Dislexia;


public class DictatorDave extends Leader {
	private static DictatorDave t;
	
	private DictatorDave() {
		super("Dictator Dave", Dislexia.getDislexia());
		setDescriptions("The sole holder of Dislexian authority");
		setDialog("Interesting situation here...");
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

	@Override
	public void converse() {
		// TODO Auto-generated method stub
		
	}
}
