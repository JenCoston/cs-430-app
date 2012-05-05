package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.AdoetteActivity;

public class Adoette extends Citizen {
	private static Adoette t;

	private Adoette() {
		super("Adoette",
				"Adoette is the daughter of the village wise-man. She is training with her grandmother to learn the skills so that one day she can provide medicine to the village.",
				Ambrosia.getAmbrosia(),
				AdoetteActivity.class,
				"Greetings!",
				"I really know my medicine, if you need a doctor",
				"What a sad day it is, indeed."
		);
	}

	public static Adoette getAdoette() {
		if (t==null)
			t = new Adoette();
		return t;
	}

}