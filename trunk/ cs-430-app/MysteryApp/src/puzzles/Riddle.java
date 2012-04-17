package puzzles;

public class Riddle {
	private String riddle;
	private int id;
	private String answer;
	
	public Riddle(String r, int i, String a){
		riddle = r;
		id = i;
		answer = a;		
	}
	
	public boolean compareTo(Riddle r){
		if(this.id == r.id){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean correct(String ans){
		if(this.answer.equalsIgnoreCase(ans)){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * @return the riddle
	 */
	public String getRiddle() {
		return riddle;
	}
	
	public int getID(){
		return id;
	}



}
