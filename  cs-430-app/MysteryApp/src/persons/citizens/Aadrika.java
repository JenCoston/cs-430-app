package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.AadrikaActivity;

public class Aadrika extends Citizen {
	private static Aadrika t;

	private Aadrika() {
		super("Aadrika",
				"A known trouble maker, Aadrika has stolen from just about every market in the city. She uses her wiles to distract the vendors while she steels their goods.",
				Ambrosia.getAmbrosia(),
				AadrikaActivity.class,
				""
		);
	}

	public static Aadrika getAadrika() {
		if (t==null)
			t = new Aadrika();
		return t;
	}

}