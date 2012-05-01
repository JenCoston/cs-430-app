package persons.citizens;

import persons.Citizen;
import locations.Dislexia;
import persons.citizens.activities.ElizavetaActivity;

public class Elizaveta extends Citizen {
	private static Elizaveta t;

	private Elizaveta() {
		super("Elizaveta",
				"Princess Elizaveta is the oldest daughter of the Czar. Before the revolution, her family was the richest in the land. Now, she lives in exile with her family in the housing for the homeless.",
				Dislexia.getDislexia(),
				ElizavetaActivity.class,
				""
		);
	}

	public static Elizaveta getElizaveta() {
		if (t==null)
			t = new Elizaveta();
		return t;
	}

}