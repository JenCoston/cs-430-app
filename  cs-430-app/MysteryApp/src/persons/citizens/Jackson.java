package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.JacksonActivity;

public class Jackson extends Citizen {
	private static Jackson t;

	private Jackson() {
		super("Jackson",
				"Jackson has been mining for gold for fifteen years. He has been searching for his big break. It looks like he finally found it.",
				Ambrosia.getAmbrosia(),
				JacksonActivity.class,
				"Good Day!",
				"Found any gold?",
				"Hi Ho Hi Ho Off To Work I Go"
		);
	}

	public static Jackson getJackson() {
		if (t==null)
			t = new Jackson();
		return t;
	}

}