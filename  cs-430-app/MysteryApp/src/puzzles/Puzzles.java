package puzzles;

import java.util.ArrayList;
import java.util.Collections;

import com.android.mysteryApp.R;

public class Puzzles {
	
    private static Puzzles t;
    private static ArrayList<Puzzle> result;
    private static int i;
    
    
    private Puzzles(){
    	puzzleList();
    	i = 0;
    }
    
	public static Puzzles getPuzzle() {
		if (t==null)
			t = new Puzzles();
		return t;
	}
	
	public Puzzle singlePuzzle(){
		Puzzle r;
		if(i <= 9){
			r = result.get(i);
			i++;
		}
		else{
			i = 0;
			Collections.shuffle(result);
			r = result.get(i);
		}
		return r;
	}
	
	public boolean correct(String a, int id){
		for(Puzzle r: result){
			if(r.getID() == id){
				if(r.correct(a)){
					return true;
				}
			}
		}
		return false;
	}
	
    private void puzzleList(){
    	int numPuzzles = 10;
		result = new ArrayList<Puzzle>();
		for (int i=0; i< numPuzzles; i++) {
			result.add(new Puzzle(getPuzzle(i), getID(i), getAnswer(i)));
		}
		Collections.shuffle(result);
    }
    
    private String getPuzzle(int n){
    	String puzzle = null;
    	switch(n){
    	case 1:
    		puzzle = "My people have a long, proud history of making and selling tea." + 
    				"Tourists flock to our venders to bring home an original teapot." + 
    				"How many teapots is this vender selling?";
    		break;
    	case 2:
    		puzzle = "My people have a long, proud history of making and selling tea." + 
    				"Tourists flock to our venders to bring home an original teapot." + 
    				"How many teapots is this vender selling?";
    		break;
    	case 3:
    		puzzle = "The people of my land welecomed the foreigners with our" + 
    				"proud tradition of creating an army of snowmen." + 
    				"How many of them are still here?";
    		break;
    	case 4:
    		puzzle = "The people of my land welecomed the foreigners with our" + 
    				"proud tradition of creating an army of snowmen." + 
    				"How many of them are still here?";
    		break;    		
    	case 5: 
    		puzzle = "The forests of this land are known to be fraught with danger." +
    				"Just take a look. How many bears can you find?";
    		break;
    	case 6: 
    		puzzle = "The forests of this land are known to be fraught with danger." +
    				"Just take a look. How many bears can you find?";
    		break;
    	case 7:
    		puzzle = "The jungles are lush with monkeys and tigers." + 
    				"One of my favorite past time is to count them." + 
    				"How many monkeys would I find if I looked today?";
    		break;
    	case 8:
    		puzzle = "The jungles are lush with monkeys and tigers." + 
    				"One of my favorite past time is to count them." +
    				"How many tigers would I find if I looked today?";
    		break;
    	case 9:
    		puzzle = "The people have a long proud history of agricultural excelence." +
    				"Just take a visit to one of our local farms." + 
    				"How many items of food can be found here?";
    		break;
    	case 10:
    		puzzle = "Never leave the house without an umbrella." + 
    				"How many can be found in this image? ";
    		break;
    	case 11:
    		puzzle = "The land of cowboys and indians." + 
    				"How many gunslingers of the wild west are out on the open range today?";
    		break;
    	case 12:
    		puzzle = "Known for producing the finest jewels in the land." + 
    				"While here, the dignitaries toured the mine." + 
    				"Tell me how many jewels were produced?";
    		break;
    	case 13:
    		puzzle = "One can't journey into the land without finding a snake." + 
    				"The natives are known to use them for most things." + 
    				"A stop at a tribial camp can reveal many." + 
    				"How many snakes could a tribal member find if they went snake hunting?";
    		break;
    		
    	case 14:
    		puzzle = "People flock to this land to collect seashells on the beaches." + 
    				"How many shells could a tourist collect today?";
    	}
    	return puzzle;
    }
    
    private String getAnswer(int n){
    	String answer = null;
    	switch(n){
    	case 1:
    		answer = "6";
    		break;
    	case 2:
    		answer = "10";
    		break;
    	case 3: 
    		answer = "16";
    		break;
    	case 4:
    		answer = "12";
    		break;
    	case 5:
    		answer = "8";
    		break;
    	case 6:
    		answer = "6";
    		break;
    	case 7:
    		answer = "6";
    		break;
    	case 8:
    		answer = "5";
    		break;
    	case 9:
    		answer = "12";
    		break;
    	case 10:
    		answer = "10";
    		break;
    	case 11:
    		answer = "6";
    		break;
    	case 12:
    		answer = "6";
    		break;
    	case 13:
    		answer = "10";
    		break;
    	case 14:
    		answer = "17";
    		break;
    	}
    	return answer;
    }

    private int getID(int n){
    	int puzzleID = 0;
    	switch(n){
    	case 1:
    		puzzleID = R.layout.countingteapotspuzz;
    		break;
    	case 2:
    		puzzleID = R.layout.countingteapots2puzz;
    		break;
    	case 3: 
    		puzzleID = R.layout.snowman1puzz;
    		break;
    	case 4:
    		puzzleID = R.layout.snowman2puzz;
    		break;
    	case 5:
    		puzzleID = R.layout.forest1puzz;
    		break;
    	case 6:
    		puzzleID = R.layout.forest2puzz;
    		break;
    	case 7:
    		puzzleID = R.layout.tigersmonkeyspuzz;
    		break;
    	case 8:
    		puzzleID = R.layout.tigersmonkeyspuzz;
    		break;
    	case 9:
    		puzzleID = R.layout.foodhiddenpuzz;
    		break;
    	case 10:
    		puzzleID = R.layout.umbrellaspuzz;
    		break;
    	case 11:
    		puzzleID = R.layout.cowboyspuzz;
    		break;
    	case 12:
    		puzzleID = R.layout.jewelspuzz;
    		break;
    	case 13:
    		puzzleID = R.layout.snakespuzz;
    		break;
    	case 14:
    		puzzleID = R.layout.seashellspuzz;
    		break;
    	}
    	return puzzleID;
    }
}
