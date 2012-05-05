package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.CalgaryActivity;

public class Calgary extends Citizen {
	private static Calgary t;

	private Calgary() {
		super("Calgary",
				"Calgary has long battled the weather. As a local shopkeeper he is saving so that he can move to a warmer country.",
				Ambrosia.getAmbrosia(),
				CalgaryActivity.class,
				"Halo! 'S fhada bho nach fhaca mi thu",
				"Hope you brought an umbrella with you!!",
				"If you were here longer I would have you stop at my store."
		);
	}

	public static Calgary getCalgary() {
		if (t==null)
			t = new Calgary();
		return t;
	}

}