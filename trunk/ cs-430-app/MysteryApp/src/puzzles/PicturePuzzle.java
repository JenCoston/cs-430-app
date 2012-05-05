package puzzles;

import persons.Investigator;
import game.Logbook;
import game.Story;
import com.android.mysteryApp.Lose;
import com.android.mysteryApp.Map;
import com.android.mysteryApp.R;
import android.app.Activity;
import android.content.Intent;
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
        setContentView(id);
        showDialog(p.getRiddle(), 10000);
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
	    	Intent i = new Intent(getApplicationContext(), Map.class);
	    	startActivity(i);
	    }
	    else{
	    	String invest = Investigator.getInvestigator().displayInvestigator();
	    	Logbook.getLogbook().addNote(invest);
	    	showDialog(invest, 10000);
	    	if(Investigator.getInvestigator().investigatorWin()){
	    		Intent i = new Intent(getApplicationContext(), Lose.class);
                startActivity(i);
	    	}
	    }
	}
	
	public void question(View view){
		showDialog(p.getRiddle(), 10000);
	}

}
