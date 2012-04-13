package persons.states;

import persons.NonPlayer;

public abstract class PuzzleState extends NonPlayerState {
	
	public PuzzleState(int id, NonPlayer np, String sayBefore) {
		super(id, np, sayBefore);
	}
	
}
