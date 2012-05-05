package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.DavidActivity;

public class David extends Citizen {
	private static David t;

	private David() {
		super("David",
				"David loves to eat. He has traveled the globe tasting the foods of the many countries.",
				Ambrosia.getAmbrosia(),
				DavidActivity.class,
				"Good Day!",
				"I'm hungry!",
				"You wouldn't happen to have some spare food on you, would you?"
		);
	}

	public static David getDavid() {
		if (t==null)
			t = new David();
		return t;
	}

}