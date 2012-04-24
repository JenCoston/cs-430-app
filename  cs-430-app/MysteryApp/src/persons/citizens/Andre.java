package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Andre extends Citizen {
	private static Andre t;

	private Andre() {
		super("Andre",
				"Lord Andre is known as the court playboy. He has dated most of the ladies at court. His sights are currently set on newcomer Lady Bernette.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Andre getAndre() {
		if (t==null)
			t = new Andre();
		return t;
	}

}