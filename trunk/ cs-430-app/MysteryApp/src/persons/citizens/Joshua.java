package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.JoshuaActivity;

public class Joshua extends Citizen {
	private static Joshua t;

	private Joshua() {
		super("Joshua",
				"Joshua's passion is art. He travels the world admiring statues and paintings.",
				Ambrosia.getAmbrosia(),
				JoshuaActivity.class,
				"Good Day!",
				"I've traveled the world looking for unique art.",
				"I heard the victim had some beautiful pieces of art in their collection..."
		);
	}

	public static Joshua getJoshua() {
		if (t==null)
			t = new Joshua();
		return t;
	}

}