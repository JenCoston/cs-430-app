package persons.leaders;

import persons.Leader;
import locations.Orient;


public class EmperorEddy extends Leader {
	private static EmperorEddy t;
	
	private EmperorEddy() {
		super("Emperor Eddy",
				"Orient's fearless ruler",
				Orient.getOrient(),
				"Hello.  What a complication this is!",
				"Excuse me but it's about time for the cricket match!",
			    "What emperor could be without his empire? I know I won't be.",
			    "Emperors have a long and vast tradition as rulers of LARGE areas of land. What could be larger than the world?",
			    "Everyone knows that the emperors hold the highest title in the land. My guru gave me his personal assurance that I will win."
		);
	}
	
	public static EmperorEddy getEmperorEddy() {
		if (t==null)
			t = new EmperorEddy();
		return t;
	}

}
