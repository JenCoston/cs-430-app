package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Mason extends Citizen {
	private static Mason t;

	private Mason() {
		super("Mason",
				"Mason is new to the tour guide business. After being fired from multiple jobs as a salesman, he is learning that even the job of a tour guide is fraught with peril.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Mason getMason() {
		if (t==null)
			t = new Mason();
		return t;
	}

}