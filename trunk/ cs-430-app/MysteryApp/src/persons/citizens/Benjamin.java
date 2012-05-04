package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.BenjaminActivity;

public class Benjamin extends Citizen {
	private static Benjamin t;

	private Benjamin() {
		super("Benjamin",
				"Benjamin just started mining. He is very safety cautious and fears getting injured on the job. He inspects everything before beginning a task.",
				Ambrosia.getAmbrosia(),
				BenjaminActivity.class,
				""
		);
	}

	public static Benjamin getBenjamin() {
		if (t==null)
			t = new Benjamin();
		return t;
	}

}