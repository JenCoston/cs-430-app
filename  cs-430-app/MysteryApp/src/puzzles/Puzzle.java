package puzzles;

public class Puzzle {
	private String puzzle;
	private int id;
	private String answer;
	
	public Puzzle(String r, int i, String a){
		puzzle = r;
		id = i;
		answer = a;		
	}
	
	public boolean compareTo(Puzzle r){
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
	 * @return the puzzle
	 */
	public String getRiddle() {
		return puzzle;
	}
	
	public int getID(){
		return id;
	}



}
