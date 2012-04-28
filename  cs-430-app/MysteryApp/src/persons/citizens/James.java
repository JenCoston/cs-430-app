package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.JamesActivity;

public class James extends Citizen {
	private static James t;

	private James() {
		super("James",
				"James loves to hike. He journeyed here especially for the scenery. While hiking he loves to take pictures of the vistas and locals.",
				Ambrosia.getAmbrosia(),
				JamesActivity.class,
				""
		);
	}

	public static James getJames() {
		if (t==null)
			t = new James();
		return t;
	}

}