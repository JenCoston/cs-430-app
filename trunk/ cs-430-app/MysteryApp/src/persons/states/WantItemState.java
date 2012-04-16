package persons.states;

import android.content.Context;
import persons.NonPlayer;

public class WantItemState extends NonPlayerState {
	private String itemWanted;
	
	public WantItemState(NonPlayer np, String itemWanted) {
		super(WANTED_ITEM_STATE, np, "I could really use the "+itemWanted+".");
		this.itemWanted = itemWanted;
	}

	@Override
	public boolean execute(Context context) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getWantedItem() {
		return itemWanted;
	}
	
}
