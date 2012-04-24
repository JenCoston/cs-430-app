package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Isabella extends Citizen {
	private static Isabella t;

	private Isabella() {
		super("Isabella",
				"Isabella is very devout. As she goes about her day, she often finds things to talk to God about. Often she is struck by the need to kneel and thank him.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Isabella getIsabella() {
		if (t==null)
			t = new Isabella();
		return t;
	}

}