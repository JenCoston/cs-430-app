package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.IsabellaActivity;

public class Isabella extends Citizen {
	private static Isabella t;

	private Isabella() {
		super("Isabella",
				"Isabella is very devout. As she goes about her day, she often finds things to talk to God about. Often she is struck by the need to kneel and thank him.",
				Ambrosia.getAmbrosia(),
				IsabellaActivity.class,
				"Good DAy!",
				"Let us take a moment to pray!",
				"Can we all join hands in fellowship?"
		);
	}

	public static Isabella getIsabella() {
		if (t==null)
			t = new Isabella();
		return t;
	}

}