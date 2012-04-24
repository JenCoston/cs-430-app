package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Noah extends Citizen {
	private static Noah t;

	private Noah() {
		super("Noah",
				"Noah's motto is always be prepared and have fun. He has known to do both. His patented umbrella hat is now a staple for all tourists.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Noah getNoah() {
		if (t==null)
			t = new Noah();
		return t;
	}

}