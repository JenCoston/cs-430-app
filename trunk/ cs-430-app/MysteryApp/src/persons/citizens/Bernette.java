package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.BernetteActivity;

public class Bernette extends Citizen {
	private static Bernette t;

	private Bernette() {
		super("Bernette",
				"Lady Bernette has been a lady in the court for six months. As a newcomer, she is still learning the ropes but as close friends with the court gossip she is learning quickly.",
				Ambrosia.getAmbrosia(),
				BernetteActivity.class,
				""
		);
	}

	public static Bernette getBernette() {
		if (t==null)
			t = new Bernette();
		return t;
	}

}