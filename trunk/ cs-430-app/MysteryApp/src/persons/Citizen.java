package persons;

import persons.activities.NonPlayerActivity;
import locations.Location;

public abstract class Citizen extends NonPlayer {
	
	public Citizen(String name, String desc, Location location, Class<? extends NonPlayerActivity> cl, String... choices) {
		super(name, desc, location, cl, choices);
	}

}
