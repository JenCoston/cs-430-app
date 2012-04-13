package persons;

import game.Story;

import java.util.ArrayList;

import locations.Location;


public abstract class NonPlayer extends Person {
	private Location home;
	protected ArrayList<String> dialog;
	protected ArrayList<String> descs;
	private int state;//replace with stateQueue - when conversing, call dialog if uninter and call Qhead if interesting
	private boolean interesting;
	
	public NonPlayer(String name, Location loc) {
		super(name);
		descs = new ArrayList<String>();
		dialog = new ArrayList<String>();
		home = loc;
		state = 0;
		setCurrentLocation(home);
		interesting = false;
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
		if (state == 0)
			return getStateZeroDialog();
		else {
			Story.getStory().advanceInterestingLocation();
			state--;
			//return dialog.get(state-1);
			return dialog.get(state);
		}
	}
	
	public abstract void satisfy();
	
	public abstract String converse();
	
	private String getStateZeroDialog() {
		return "You should investigate "+Story.getStory().getInterestingLocation();
	}

	public void nextState() {
		state++;
	}
	
	public boolean isInteresting() {
		return interesting;
	}
	
}
