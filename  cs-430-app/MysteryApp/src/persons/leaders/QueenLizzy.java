package persons.leaders;

import persons.Leader;
import locations.Edenborough;

public class QueenLizzy extends Leader {
	private static QueenLizzy t;
		
	private QueenLizzy() {
		super("Queen Lizzy",
				"Her royal highness of Edenborough",
				Edenborough.getEdenborough(),
				"Oh dear what a shame this is!",
				"Oh me Oh my!");
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
}
