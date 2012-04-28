package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.MathewActivity;

public class Mathew extends Citizen {
	private static Mathew t;

	private Mathew() {
		super("Mathew",
				"Mathew has always wanted to learn how to ski. He traveled far and wide looking for someplace to learn. After arriving here, he took to the slopes. So, far everything is going well.",
				Ambrosia.getAmbrosia(),
				MathewActivity.class,
				""
		);
	}

	public static Mathew getMathew() {
		if (t==null)
			t = new Mathew();
		return t;
	}

}