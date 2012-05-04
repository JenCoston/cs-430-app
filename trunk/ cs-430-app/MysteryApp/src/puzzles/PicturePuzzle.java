package puzzles;

import persons.Investigator;
import game.Logbook;
import game.Story;

import com.android.mysteryApp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PicturePuzzle extends PuzzleActivity {
	
	private Puzzle p;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        p = Puzzles.getPuzzle().singlePuzzle();
        id = p.getID();
        setContentView(p.getID());
        showDialog(p.getRiddle(), 5000);
    }

	@Override
	public void submitAnswer(View view) {
		      //plain text input
	    final EditText plain_edit_text = (EditText) this.findViewById(R.id.editText1);
	    String response = plain_edit_text.getText().toString();
	    if(response == null){
	    	  showDialog("Make sure you give an answer!", 10000); 
	      }
	      else if(Puzzles.getPuzzle().correct(response, id)){
	    	String clue = Story.getStory().getClue();
	    	Logbook.getLogbook().addNote("\t" + clue);
	    	showDialog("Congratulations! Here's a clue to help solve the mystery: " + clue, 10000);
	    	Story.getStory().advanceInterestingNonPlayer();
	    }
	    else{
	    	String invest = Investigator.getInvestigator().displayInvestigator();
	    	showDialog(invest, 3000);
	    	if(Investigator.getInvestigator().investigatorWin()){
	    		//Lose screen. Game over.
	    	}
	    }
	}
	
	public void question(View view){
		showDialog(p.getRiddle(), 3000);
	}

}
