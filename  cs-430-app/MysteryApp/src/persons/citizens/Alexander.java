package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Alexander extends Citizen {
	private static Alexander t;

	private Alexander() {
		super("Alexander",
				"Alexander is a local man. After the war, he retired from the army. However, he still does not leave the house without his sword.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Alexander getAlexander() {
		if (t==null)
			t = new Alexander();
		return t;
	}

}