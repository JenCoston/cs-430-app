package persons.leaders;

import persons.Leader;
import locations.Concordia;

public class ChancellorChuck extends Leader {
	private static ChancellorChuck t;
		
	private ChancellorChuck() {
		super("Chancellor Chuck",
				"Condordia's beloved executive",
				Concordia.getConcordia(),
				"What a dreadful deed that has been done!",
				"Its not my fault!",
				"Nothing like this could happen on my watch!",
				"Only the strong survive, I suppose."
		);
	}
		
	public static ChancellorChuck getChancellorChuck() {
		if (t==null)
			t = new ChancellorChuck();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}
}

