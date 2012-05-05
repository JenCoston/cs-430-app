package persons.citizens;

import persons.Citizen;
import locations.Wallaby;
import persons.citizens.activities.SamanthaActivity;

public class Samantha extends Citizen {
	private static Samantha t;

	private Samantha() {
		super("Samantha",
				"Samantha wants to be athletic and looking into the many different sports. Currently she is trying Frisbee.",
				Wallaby.getWallaby(),
				SamanthaActivity.class,
				"Ezayko!",
				"Would you like to play some Frisbee golf?",
				"Go long..."
		);
	}

	public static Samantha getSamantha() {
		if (t==null)
			t = new Samantha();
		return t;
	}

}