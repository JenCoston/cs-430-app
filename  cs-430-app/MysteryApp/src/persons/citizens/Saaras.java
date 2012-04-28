package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.SaarasActivity;

public class Saaras extends Citizen {
	private static Saaras t;

	private Saaras() {
		super("Saaras",
				"Saaras started dancing at the age of 3. She has been classically trained in Natya the sacred Hindu musical theater styles. She usually only performs for the elite.",
				Ambrosia.getAmbrosia(),
				SaarasActivity.class,
				""
		);
	}

	public static Saaras getSaaras() {
		if (t==null)
			t = new Saaras();
		return t;
	}

}