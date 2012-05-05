package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.EwanActivity;

public class Ewan extends Citizen {
	private static Ewan t;

	private Ewan() {
		super("Ewan",
				"Ewan has long and unsuccessful history flirting with Ailsa who has spurned his advances. However, Ewan is determined to win her heart and continue to make romantic gestures.",
				Ambrosia.getAmbrosia(),
				EwanActivity.class,
				"Good Day!",
				"Have you seen my fairest Ailsa today?",
				"Ailsa is the most beautiful lady in all the lands!"
		);
	}

	public static Ewan getEwan() {
		if (t==null)
			t = new Ewan();
		return t;
	}

}