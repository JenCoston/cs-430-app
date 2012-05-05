package persons.citizens;

import persons.Citizen;
import locations.Dislexia;
import persons.citizens.activities.MathewActivity;

public class Mathew extends Citizen {
	private static Mathew t;

	private Mathew() {
		super("Mathew",
				"Mathew has always wanted to learn how to ski. He traveled far and wide looking for someplace to learn. After arriving here, he took to the slopes. So, far everything is going well.",
				Dislexia.getDislexia(),
				MathewActivity.class,
				"Privet!",
				"If you have time, lets go down the slopes!",
				"Are you sure you are dressed warm enough for this weather?"
		);
	}

	public static Mathew getMathew() {
		if (t==null)
			t = new Mathew();
		return t;
	}

}