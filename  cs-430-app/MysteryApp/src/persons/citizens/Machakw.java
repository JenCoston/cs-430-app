package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;

public class Machakw extends Citizen {
	private static Machakw t;

	private Machakw() {
		super("Machakw",
				"Machakw is a well know tracker. His skills are known throughout the village. If you need to find something he is the man to see.",
				Ambrosia.getAmbrosia(),
				""
		);
	}

	public static Machakw getMachakw() {
		if (t==null)
			t = new Machakw();
		return t;
	}

}