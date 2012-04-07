package persons.leaders;

import persons.Leader;
import locations.Pacifica;


public class PresidentPaul extends Leader {
	private static PresidentPaul t;
	
	private PresidentPaul() {
		super("President Paul", Pacifica.getPacifica());
		setDescriptions("The charismatic chief executive of Pacifica");
		setDialog("Well hello there!  Now what do you think of all this?");
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
	public String converse() {
		// TODO Auto-generated method stub
		String hint = "Don't worry I will find out who the culprit is!";
		return hint;
		
	}
}
