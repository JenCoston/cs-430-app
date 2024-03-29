package persons;

import game.Story;
import locations.Location;
import persons.activities.NonPlayerActivity;
import persons.states.NonPlayerDialog;
import persons.states.NonPlayerState;
import persons.states.WantItemState;
import android.content.Context;
import android.content.Intent;


public abstract class NonPlayer extends Person {
	private Location home;
	private String desc;
	//private StateQueue stateQueue;
	private NonPlayerState currentState;
	private boolean interesting;
	private NonPlayerDialog dialog;
	private Class<? extends NonPlayerActivity> cl;
	
	public NonPlayer(String name, String desc, Location loc, Class<? extends NonPlayerActivity> cl, String... choices) {
		super(name);
		this.desc = desc;
		home = loc;
		setCurrentLocation(home);
		//stateQueue = new StateQueue();
		currentState = null;
		interesting = false;
		dialog = new NonPlayerDialog(choices);
		this.cl = cl;
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
	
	public void satisfy() {
		//give clue??
		//currentState = null;
		Story.getStory().advanceInterestingNonPlayer();
	}
	
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

	public NonPlayerState perform() {
		return currentState.execute();///
	}
	
	public Intent getIntent(Context context) {
		return new Intent(context, cl);
	}
}
