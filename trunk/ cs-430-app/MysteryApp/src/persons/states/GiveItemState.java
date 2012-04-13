package persons.states;

import persons.NonPlayer;

public abstract class GiveItemState extends NonPlayerState {
	
	//this class may not get used - still under consideration
	public GiveItemState(int id, NonPlayer np, String sayBefore) {
		super(id, np, sayBefore);
	}
	
}
