package persons.citizens;

import persons.Citizen;
import locations.Orient;
import persons.citizens.activities.ChristinaActivity;

public class Christina extends Citizen {
	private static Christina t;

	private Christina() {
		super("Christina",
				"Christina has traveled the world learning to dance. While faced with coordination issues, her enthusiasm is contagious.",
				Orient.getOrient(),
				ChristinaActivity.class,
				""
		);
	}

	public static Christina getChristina() {
		if (t==null)
			t = new Christina();
		return t;
	}

}