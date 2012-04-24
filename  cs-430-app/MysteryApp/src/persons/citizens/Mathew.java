package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Mathew extends Citizen {
	private static Mathew t;

	private Mathew() {
		super("Mathew",
				"Mathew has always wanted to learn how to ski. He traveled far and wide looking for someplace to learn. After arriving here, he took to the slopes. So, far everything is going well.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Mathew getMathew() {
		if (t==null)
			t = new Mathew();
		return t;
	}

}