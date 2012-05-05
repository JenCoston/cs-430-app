package puzzles;

import persons.Investigator;
import game.Logbook;
import game.Story;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.mysteryApp.Lose;
import com.android.mysteryApp.Map;
import com.android.mysteryApp.R;

public class RiddlePuzzle extends PuzzleActivity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riddlepuzz);
        
        TextView t = new TextView(this); 
        t = (TextView)findViewById(R.id.textView2); 
        Riddle r = Riddles.getRiddles().singleRiddle();
        id = r.getID();
        t.setText(r.getRiddle());
        t.setTextSize(25);
    }
    
	public void submitAnswer(View view){
	      //plain text input
      final EditText plain_edit_text = (EditText) this.findViewById(R.id.editText1);
      String response = plain_edit_text.getText().toString();
      if(response == null){
    	  showDialog("Make sure you give an answer!", 10000); 
      }
      else if(Riddles.getRiddles().correct(response, id)){
    	String clue = Story.getStory().getClue();
    	if(clue == null){
    		clue = Story.getStory().getClue();
    	}
    	Logbook.getLogbook().addNote("\t" + clue);
      	showDialog("Congratulations! Here's a clue to help solve the mystery: " + clue , 10000);
      	Story.getStory().advanceInterestingNonPlayer();
      	Intent i = new Intent(getApplicationContext(), Map.class);
        startActivity(i);
      }
      else{
    	  String invest = Investigator.getInvestigator().displayInvestigator();
    	  showDialog(invest, 10000);
    	  Logbook.getLogbook().addNote(invest);
    	  if(Investigator.getInvestigator().investigatorWin()){
    		  Intent i = new Intent(getApplicationContext(), Lose.class);
              startActivity(i);
    	  }
    	  else{
    		  Intent i = new Intent(getApplicationContext(), Map.class);
    	      startActivity(i);
    	  }
      }
	}

}
