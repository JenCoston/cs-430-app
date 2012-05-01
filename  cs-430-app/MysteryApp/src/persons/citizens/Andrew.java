package persons.citizens;

import persons.Citizen;
import locations.Pacifica;
import persons.citizens.activities.AndrewActivity;

public class Andrew extends Citizen {
	private static Andrew t;

	private Andrew() {
		super("Andrew",
				"Andrew has lost his horse. After searching for hours he has taken a break to drink some coffee.",
				Pacifica.getPacifica(),
				AndrewActivity.class,
				""
		);
	}

	public static Andrew getAndrew() {
		if (t==null)
			t = new Andrew();
		return t;
	}

}