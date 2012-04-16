package persons;

import android.content.Context;

import persons.states.NonPlayerDialog;
import persons.states.NonPlayerState;
import persons.states.StateQueue;
import persons.states.WantItemState;

import locations.Location;


public abstract class NonPlayer extends Person {
	private Location home;
	private String desc;
	//private StateQueue stateQueue;
	private NonPlayerState currentState;
	private boolean interesting;
	private NonPlayerDialog dialog;
	
	public NonPlayer(String name, String desc, Location loc, String... choices) {
		super(name);
		this.desc = desc;
		home = loc;
		setCurrentLocation(home);
		//stateQueue = new StateQueue();
		currentState = null;
		interesting = false;
		dialog = new NonPlayerDialog(choices);
	}
	
	public String getFullName() {
		return getName() + " of " + home.getName();
	}
	
	public String getDescription() {
		return desc;
	}
	
	/*public String getDialog() {
		if (state == 0)
			return getStateZeroDialog();
		else {
			Story.getStory().advanceInterestingLocation();
			state--;
			//return dialog.get(state-1);
			return dialog.get(state);
		}
	}*/
	
	public abstract void satisfy();
	
	public String converse() {
		if (isInteresting() == false) {
			return dialog.say();
		}
		else {
			//return stateQueue.head().getSayBefore();
			return currentState.getSayBefore();
		}
	}
	
	public void perform(Context context) {
		//stateQueue.head().execute(context);
		currentState.execute(context);
	}
	
	public boolean isInteresting() {
		//if (stateQueue.isEmpty())
		if (currentState == null)
			interesting = false;
		return interesting;
	}
	
	public void makeInteresting() {
		interesting = true;
	}
	
	public void makeInteresting(NonPlayerState state) {
		currentState = state;
		interesting = true;
	}
	
	public void makeUninteresting() {
		interesting = false;
	}

	public boolean wantsItem() {
		return ((currentState != null) && (currentState instanceof WantItemState));
	}
	
	public String getWantedItem() {
		return ((WantItemState)currentState).getWantedItem();
	}
	
}
