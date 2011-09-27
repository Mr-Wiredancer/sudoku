package common.test;

import android.app.Activity;
import android.os.Bundle;

public class Game extends Activity {
    private int puzzle[] = new int [9*9];

    /** Called when the activity is first created. */
    @Override    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PuzzleView puzzleView = new PuzzleView(this);
        setContentView(puzzleView);
        
        
    }
}