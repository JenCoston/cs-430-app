package persons;

import locations.Location;

public abstract class Citizen extends NonPlayer {
	
	public Citizen(String name, String desc, Location location, String... choices) {
		super(name, desc, location, choices);
	}

}
