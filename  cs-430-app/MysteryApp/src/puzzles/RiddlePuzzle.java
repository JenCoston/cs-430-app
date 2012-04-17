package puzzles;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

}
