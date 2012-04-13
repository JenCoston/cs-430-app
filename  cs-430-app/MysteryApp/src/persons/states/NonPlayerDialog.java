package persons.states;

import game.Story;

import java.util.ArrayList;

public class NonPlayerDialog implements DialogStrings {
	private int currentOp;
	private ArrayList<String> dialog;
	//private boolean complete;//special dialog for if you are done with them?
	
	public NonPlayerDialog(String... ops) {
		currentOp = 0;
		dialog = new ArrayList<String>();
		for (int i=0; i<ops.length; i++)
			dialog.add(ops[i]);
	}
	
	public String say() {
		String result;
		if (currentOp < dialog.size()) {
			result =  dialog.get(currentOp);
			currentOp++;
		}
		else if (currentOp == dialog.size()) {
			result = NP_REFERRAL + Story.getStory().getInterestingNonPlayer().getName();
			currentOp++;
		}
		else {//(currentOp == (dialog.size() + 1)) 
			result = LOC_REFERRAL + Story.getStory().getInterestingNonPlayer().getCurrentLocation().getName();
			currentOp = 0;
		}
		return result;
	}
}
