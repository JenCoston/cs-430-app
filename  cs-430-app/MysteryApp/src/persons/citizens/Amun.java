package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Amun extends Citizen {
	private static Amun t;

	private Amun() {
		super("Amun",
				"Amun wants to be an artist. Daily he travels around the city looking for inspiration for his statues and paintings.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Amun getAmun() {
		if (t==null)
			t = new Amun();
		return t;
	}

}