package persons.citizens;

import persons.Citizen;
import locations.Dislexia;
import persons.citizens.activities.AlexanderActivity;

public class Alexander extends Citizen {
	private static Alexander t;

	private Alexander() {
		super("Alexander",
				"Alexander is a local man. After the war, he retired from the army. However, he still does not leave the house without his sword.",
				Dislexia.getDislexia(),
				AlexanderActivity.class,
				"Privet!",
				"Have you seen my prized winning sword I have fought most of my battles with?",
				"Keep an eye out for anything fishy..."
		);
	}

	public static Alexander getAlexander() {
		if (t==null)
			t = new Alexander();
		return t;
	}

}