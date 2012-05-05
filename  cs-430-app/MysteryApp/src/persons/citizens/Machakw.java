package persons.citizens;

import persons.Citizen;
import locations.Ambrosia;
import persons.citizens.activities.MachakwActivity;

public class Machakw extends Citizen {
	private static Machakw t;

	private Machakw() {
		super("Machakw",
				"Machakw is a well known tracker. His skills are known throughout the village. If you need to find something he is the man to see.",
				Ambrosia.getAmbrosia(),
				MachakwActivity.class,
				"Salam Alaikum!",
				"I've tracked many a wild beast in my lifetime.",
				"Make sure to pay close attention to all the clues."
		);
	}

	public static Machakw getMachakw() {
		if (t==null)
			t = new Machakw();
		return t;
	}

}