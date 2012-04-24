package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Adoette extends Citizen {
	private static Adoette t;

	private Adoette() {
		super("Adoette",
				"Adoette is the daughter of the village wise-man. She is training with her grandmother to learn the skills so that one day she can provide medicine to the village.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Adoette getAdoette() {
		if (t==null)
			t = new Adoette();
		return t;
	}

}