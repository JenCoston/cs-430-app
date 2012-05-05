package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.GadinActivity;

public class Gadin extends Citizen {
	private static Gadin t;

	private Gadin() {
		super("Gadin",
				"Trained for 25 years to become a snake charmer. After a few close calls, Gadin is proud to display his skills to all of the customers in the local market.",
				Ambrosia.getAmbrosia(),
				GadinActivity.class,
				"Good Day!",
				"I've charmed many of snakes in my lifetime.",
				"I bet I would know the murderer if I saw them."
		);
	}

	public static Gadin getGadin() {
		if (t==null)
			t = new Gadin();
		return t;
	}

}