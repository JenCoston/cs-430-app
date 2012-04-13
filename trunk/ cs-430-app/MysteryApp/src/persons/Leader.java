package persons;

import locations.Location;

public abstract class Leader extends NonPlayer {
	
	public Leader(String name, String desc, Location location, String... choices) {
		super(name, desc, location, choices);
	}
	
	public abstract void satisfy();

}
