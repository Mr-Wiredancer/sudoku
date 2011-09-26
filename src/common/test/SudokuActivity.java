package common.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SudokuActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /*When "new game is pressed, this function should be called"*/
    private void startgame(){
    	//create Game activity
    	Intent i = new Intent(this,Game.class);
    	startActivity(i);
    }
}