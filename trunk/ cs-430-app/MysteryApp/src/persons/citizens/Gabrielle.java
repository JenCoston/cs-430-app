package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.GabrielleActivity;

public class Gabrielle extends Citizen {
	private static Gabrielle t;

	private Gabrielle() {
		super("Gabrielle",
				"Lady Gabrielle is the court gossip. She knows everyone and their business. If you want to know something, she is the person to ask.",
				Ambrosia.getAmbrosia(),
				GabrielleActivity.class,
				""
		);
	}

	public static Gabrielle getGabrielle() {
		if (t==null)
			t = new Gabrielle();
		return t;
	}

}