package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class David extends Citizen {
	private static David t;

	private David() {
		super("David",
				"David loves to eat. He has traveled the globe tasting the foods of the many countries.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static David getDavid() {
		if (t==null)
			t = new David();
		return t;
	}

}