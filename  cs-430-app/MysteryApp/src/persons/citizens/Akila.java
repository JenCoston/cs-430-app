package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Akila extends Citizen {
	private static Akila t;

	private Akila() {
		super("Akila",
				"Akila beauty is renown. As the daughter of the pyramid architect, not a day goes by where she goes without. Anything she desires is hers.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Akila getAkila() {
		if (t==null)
			t = new Akila();
		return t;
	}

}