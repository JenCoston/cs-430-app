package persons.citizens;

import persons.Citizen;
import locations.Orient;
import persons.citizens.activities.MasonActivity;

public class Mason extends Citizen {
	private static Mason t;

	private Mason() {
		super("Mason",
				"Mason is new to the tour guide business. After being fired from multiple jobs as a salesman, he is learning that even the job of a tour guide is fraught with peril.",
				Orient.getOrient(),
				MasonActivity.class,
				"Kon'nichiwa",
				"I'm running very late to work!",
				"Giving tours is new to me, give me a break!"
		);
	}

	public static Mason getMason() {
		if (t==null)
			t = new Mason();
		return t;
	}

}