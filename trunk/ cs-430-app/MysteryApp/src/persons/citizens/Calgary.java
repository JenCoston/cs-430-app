package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Calgary extends Citizen {
	private static Calgary t;

	private Calgary() {
		super("Calgary",
				"Calgary has long battled the weather. As a local shopkeeper he is saving so that he can move to a warmer country.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Calgary getCalgary() {
		if (t==null)
			t = new Calgary();
		return t;
	}

}