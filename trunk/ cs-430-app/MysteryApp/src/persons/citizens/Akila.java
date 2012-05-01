package persons.citizens;

import persons.Citizen;
import locations.Wallaby;
import persons.citizens.activities.AkilaActivity;

public class Akila extends Citizen {
	private static Akila t;

	private Akila() {
		super("Akila",
				"Akila beauty is renown. As the daughter of the pyramid architect, not a day goes by where she goes without. Anything she desires is hers.",
				Wallaby.getWallaby(),
				AkilaActivity.class,
				""
		);
	}

	public static Akila getAkila() {
		if (t==null)
			t = new Akila();
		return t;
	}

}