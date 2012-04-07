package persons;

import locations.Location;

public abstract class Leader extends NonPlayer {
	
	public Leader(String name, Location location) {
		super(name, location);
	}
	
	public abstract void satisfy();

	public abstract String converse();

}
