package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.EthanActivity;

public class Ethan extends Citizen {
	private static Ethan t;

	private Ethan() {
		super("Ethan",
				"Ethan finds it important to keep up with the events in the world. He has been keeping a close eye on the events of the summit. In fact, he is known as a local expert on the subject.",
				Ambrosia.getAmbrosia(),
				EthanActivity.class,
				""
		);
	}

	public static Ethan getEthan() {
		if (t==null)
			t = new Ethan();
		return t;
	}

}