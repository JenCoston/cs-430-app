package persons.states;

import persons.NonPlayer;

public abstract class WantItemState extends NonPlayerState {
	
	public WantItemState(int id, NonPlayer np, String sayBefore) {
		super(id, np, sayBefore);
	}
	
}
