package persons.leaders;

import persons.Leader;
import locations.Scimitar;

public class SultanSam extends Leader {
	private static SultanSam t;
	
	private SultanSam() {
		super("Sultan Sam",
				"The Scimitar governing head",
				Scimitar.getScimitar(),
				"Greetings.  We could use some help sorting this out.",
				"Ask Abu!",
				"Sultans rule the Arab world, so why not the rest?",
				"That little viper? Don't you know to kill a snake you have to chop off its head?",
				"I have my ways to take care of trouble."
		);
	}
		
	public static SultanSam getSultanSam() {
		if (t==null)
			t = new SultanSam();
		return t;
	}

}
