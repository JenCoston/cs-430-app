package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.RyanActivity;

public class Ryan extends Citizen {
	private static Ryan t;

	private Ryan() {
		super("Ryan",
				"Guard Ryan has been a soldier for 3 years. He is learning that it takes a lot of patience to deal with the many tourists that come to tour the palace.",
				Ambrosia.getAmbrosia(),
				RyanActivity.class,
				""
		);
	}

	public static Ryan getRyan() {
		if (t==null)
			t = new Ryan();
		return t;
	}

}