package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.NoahActivity;

public class Noah extends Citizen {
	private static Noah t;

	private Noah() {
		super("Noah",
				"Noah's motto is always be prepared and have fun. He has known to do both. His patented umbrella hat is now a staple for all tourists.",
				Ambrosia.getAmbrosia(),
				NoahActivity.class,
				""
		);
	}

	public static Noah getNoah() {
		if (t==null)
			t = new Noah();
		return t;
	}

}