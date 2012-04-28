package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.EmmaActivity;

public class Emma extends Citizen {
	private static Emma t;

	private Emma() {
		super("Emma",
				"Emma makes apple butter for the tourists using tried and true methods taught to her by her great-grandmother. The secret is the cedar wood used for the fire.",
				Ambrosia.getAmbrosia(),
				EmmaActivity.class,
				""
		);
	}

	public static Emma getEmma() {
		if (t==null)
			t = new Emma();
		return t;
	}

}