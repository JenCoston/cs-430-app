package persons;

import persons.leaders.AmbassadorAmber;


public class Investigator{
	
	private static Investigator t;
	private int steps;
	private String name;

	private Investigator() {
		steps = 0;
		name = "Investigator Clueless";
	}

	public static Investigator getInvestigator(){
		if (t==null)
			t = new Investigator();
		return t;
	}
	
	/**
	 * @return the steps
	 */
	public int getSteps() {
		return steps;
	}

	/**
	 * @param steps the steps to set
	 */
	public void setSteps(int steps) {
		this.steps = steps;
	}
	
	public String displayInvestigator(){
		String tmp;
		if(steps <= 20){
			tmp = "The supreme" + name + "found the clue. He is one step closer to solving this mystery. He is at step " + steps + " of 20.";
			steps++;
		}
		else{
			tmp = "Unfortunately, " + name + " got there first.";
		}
		return tmp;
	}
	
	public boolean investigatorWin(){
		if(steps > 20){
			return true;
		}
		return false;
	}

}
