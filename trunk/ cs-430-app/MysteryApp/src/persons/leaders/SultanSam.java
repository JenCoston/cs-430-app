package persons.leaders;

import persons.Leader;
import locations.Scimitar;

public class SultanSam extends Leader {
	private static SultanSam t;
	
	private SultanSam() {
		super("Sultan Sam", Scimitar.getScimitar());
		setDescriptions("The Scimitar governing head");
		setDialog("Greetings.  We could use some help sorting this out.");
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
	public String converse() {
		// TODO Auto-generated method stub
//		String hint = "Ask Abu!";
//		return hint;
		return getDialog();
	}

}
