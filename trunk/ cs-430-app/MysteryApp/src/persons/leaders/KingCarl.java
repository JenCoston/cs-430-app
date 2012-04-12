package persons.leaders;

import persons.Leader;
import locations.Keyser;


public class KingCarl extends Leader {
	private static KingCarl t;
	
	private KingCarl() {
		super("King Carl", Keyser.getKeyser());
		setDescriptions("The enlightened despot of Keyser");
		setDialog("Greetings.  Do you know anyone good at solving mysteries?");
	}
	
	public static KingCarl getKingCarl() {
		if (t==null)
			t = new KingCarl();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String converse() {
		//For now
		//String hint = "To the charriot!";
		//return hint;
		return getDialog();
	}
}
