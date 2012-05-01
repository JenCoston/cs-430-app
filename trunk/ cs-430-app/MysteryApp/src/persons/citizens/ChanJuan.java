package persons.citizens;

import persons.Citizen;
import locations.Orient;
import persons.citizens.activities.ChanJuanActivity;

public class ChanJuan extends Citizen {
	private static ChanJuan t;

	private ChanJuan() {
		super("ChanJuan",
				"Chan-juan is a court beauty. When foreign dignitaries come to visit, it is her job to show them around.",
				Orient.getOrient(),
				ChanJuanActivity.class,
				""
		);
	}

	public static ChanJuan getChanJuan() {
		if (t==null)
			t = new ChanJuan();
		return t;
	}

}