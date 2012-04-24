package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Gadin extends Citizen {
	private static Gadin t;

	private Gadin() {
		super("Gadin",
				"Trained for 25 years to become a snake charmer. After a few close calls, Gadin is proud to display his skills to all of the customers in the local market.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Gadin getGadin() {
		if (t==null)
			t = new Gadin();
		return t;
	}

}