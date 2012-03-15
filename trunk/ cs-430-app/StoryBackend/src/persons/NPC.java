package persons;

import locations.Location;


public abstract class NPC extends Person {
	private Location home;
	
	public NPC(String name, Location loc) {
		super(name);
		home = loc;
	}
	
	public String getFullName() {
		return getName() + " of " + home.getName();
	}
	
	public abstract void satisfy();
	
	public abstract void converse();
}
