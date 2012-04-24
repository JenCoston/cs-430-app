package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Samantha extends Citizen {
	private static Samantha t;

	private Samantha() {
		super("Samantha",
				"Samantha wants to be athletic and looking into the many different sports. Currently she is trying Frisbee.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Samantha getSamantha() {
		if (t==null)
			t = new Samantha();
		return t;
	}

}