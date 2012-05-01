package persons.citizens;

import persons.Citizen;
import locations.Wallaby;
import persons.citizens.activities.AmunActivity;

public class Amun extends Citizen {
	private static Amun t;

	private Amun() {
		super("Amun",
				"Amun wants to be an artist. Daily he travels around the city looking for inspiration for his statues and paintings.",
				Wallaby.getWallaby(),
				AmunActivity.class,
				""
		);
	}

	public static Amun getAmun() {
		if (t==null)
			t = new Amun();
		return t;
	}

}