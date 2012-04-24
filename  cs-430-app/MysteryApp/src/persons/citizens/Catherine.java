package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Catherine extends Citizen {
	private static Catherine t;

	private Catherine() {
		super("Catherine",
				"Catherine has always wanted to travel. While here she has immersed herself in the local culture and taken photos of practically everything. She looks forward to sharing these with her friends and family back home.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Catherine getCatherine() {
		if (t==null)
			t = new Catherine();
		return t;
	}

}