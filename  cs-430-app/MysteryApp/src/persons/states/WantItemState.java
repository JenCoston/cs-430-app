package persons.states;

import android.content.Context;
import persons.NonPlayer;

public class WantItemState extends NonPlayerState {
	private String itemWanted;
	
	public WantItemState(int id, NonPlayer np, String sayBefore, String itemWanted) {
		super(id, np, sayBefore);
		this.itemWanted = itemWanted;
	}

	@Override
	public boolean execute(Context context) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
