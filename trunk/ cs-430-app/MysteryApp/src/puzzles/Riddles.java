package puzzles;

import java.util.ArrayList;
import java.util.Collections;

public class Riddles {
	
    private static Riddles t;
    private static ArrayList<Riddle> result;
    private static int i = 0;
    
    
    private Riddles(){
    	riddleList();
    }
    
	public static Riddles getRiddles() {
		if (t==null)
			t = new Riddles();
		return t;
	}
	
	public Riddle singleRiddle(){
		Riddle r;
		if(i <= 9){
			r = result.get(i);
			i++;
		}
		else{
			i = 0;
			r = result.get(i);
		}
		return r;
	}
	
	public boolean correct(String a, int id){
		for(Riddle r: result){
			if(r.getID() == id){
				if(r.correct(a)){
					return true;
				}
			}
		}
		return false;
	}
	
    private void riddleList(){
    	int numRiddles = 10;
		result = new ArrayList<Riddle>();
		for (int i=0; i< numRiddles; i++) {
			result.add(new Riddle(getRiddle(i), i, getAnswer(i)));
		}
		Collections.shuffle(result);
    }
    
    private String getRiddle(int n){
    	String riddle = null;
    	switch(n){
    	case 1:
    		riddle = "What comes once in a minute, Twice in a moment, But never in a thousand years?";
    		break;
    	case 2:
    		riddle = "What sits in the corner and travels around the world?";
    		break;
    	case 3: 
    		riddle = "Light as a feather with nothing in it, A strong man can’t hold it Much more than a minute?";
    		break;
    	case 4:
    		riddle = "What has six legs, Two heads, One tail and Four eyes?";
    		break;
    	case 5:
    		riddle = "What has a bottom at the top?";
    		break;
    	case 6:
    		riddle = "You go into it through one hole, You come out of it through three holes," + 
    				"When you’re inside it you’re ready to go outside, When you’re outside you’re still inside. What is it?";
    		break;
    	case 7:
    		riddle = "Placed above it, it makes things smaller. Placed beside, it makes things greater. " +
    				"In matters that count, it always comes first. Where others increase, it remains the same. What is it?";
    		break;
    	case 8:
    		riddle = "What is it that you will break, Even when you name it?";
    		break;
    	case 9:
    		riddle = "Two twins were born on the same day, They were born by the same mother," +
    				"They live on either side of a hill. They have never met , and they never will meet. What are they?";
    		break;
    	case 10:
    		riddle = "There is water that can be found Coming neither from heaven nor the ground." +
    				"It sometimes seems sweet And sometimes bitter, Though it always pours forth from the same spring. What is it?";
    		break;
    	}
    	return riddle;
    }
    
    private String getAnswer(int n){
    	String answer = null;
    	switch(n){
    	case 1:
    		answer = "The letter M";
    		break;
    	case 2:
    		answer = "A stamp";
    		break;
    	case 3: 
    		answer = "A breath";
    		break;
    	case 4:
    		answer = "A person on horseback";
    		break;
    	case 5:
    		answer = "A leg";
    		break;
    	case 6:
    		answer = "A sweater";
    		break;
    	case 7:
    		answer = "The number one";
    		break;
    	case 8:
    		answer = "Silence";
    		break;
    	case 9:
    		answer = "Your ears";
    		break;
    	case 10:
    		answer = "Tears";
    		break;
    	}
    	return answer;
    }

}
