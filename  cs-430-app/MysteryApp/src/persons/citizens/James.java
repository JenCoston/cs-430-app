package persons.citizens;

import persons.Citizen;
import locations.Pacifica;
import persons.citizens.activities.JamesActivity;

public class James extends Citizen {
	private static James t;

	private James() {
		super("James",
				"James loves to hike. He journeyed here especially for the scenery. While hiking he loves to take pictures of the vistas and locals.",
				Pacifica.getPacifica(),
				JamesActivity.class,
				"Howdy y'all",
				"Hiked any good moutains lately?",
				"Can I show you the latest pictures I have taken?"
		);
	}

	public static James getJames() {
		if (t==null)
			t = new James();
		return t;
	}

}