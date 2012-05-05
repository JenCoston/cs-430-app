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
				"Kon'nichiwa",
				"I'm the resident tour guide.",
				"Many people think that I'm the fairest in all the land..."
		);
	}

	public static ChanJuan getChanJuan() {
		if (t==null)
			t = new ChanJuan();
		return t;
	}

}