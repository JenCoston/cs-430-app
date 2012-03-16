package persons;

import java.util.ArrayList;

import locations.Location;


public abstract class NPC extends Person {
	private Location home;
	protected ArrayList<String> dialog;
	protected ArrayList<String> descs;
	private int state;
	
	public NPC(String name, Location loc) {
		super(name);
		descs = new ArrayList<String>();
		dialog = new ArrayList<String>();
		home = loc;
		state = 0;
	}
	
	public String getFullName() {
		return getName() + " of " + home.getName();
	}
	
	public void setDescriptions(String... descs) {
		for (int i=0; i<descs.length; i++)
			this.descs.add(descs[i]);
	}
	
	public void setDialog(String... choices) {
		for (int i=0; i<choices.length; i++)
			dialog.add(choices[i]);
	}
	
	public String getDescription() {
		return descs.get(state);
	}
	
	public String getDialog() {
		return dialog.get(state);
	}
	
	public abstract void satisfy();
	
	public abstract void converse();
}
