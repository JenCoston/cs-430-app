package persons.leaders;

import persons.Leader;
import locations.Edenborough;

public class QueenLizzy extends Leader {
	private static QueenLizzy t;
		
	private QueenLizzy() {
		super("Queen Lizzy", Edenborough.getEdenborough());
		setDescriptions("Her royal highness of Edenborough");
		setDialog("Oh dear what a shame this is!");
	}
		
	public static QueenLizzy getQueenLizzy() {
		if (t==null)
			t = new QueenLizzy();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String converse() {
		// TODO Auto-generated method stub
		String hint = "Oh me Oh my!";
		return hint;
		
	}
}
