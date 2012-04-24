package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Joshua extends Citizen {
	private static Joshua t;

	private Joshua() {
		super("Joshua",
				"Joshua's passion is art. He travels the world admiring statues and paintings.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Joshua getJoshua() {
		if (t==null)
			t = new Joshua();
		return t;
	}

}