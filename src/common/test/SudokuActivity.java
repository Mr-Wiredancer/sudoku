package common.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SudokuActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View continuebutton=findViewById(R.id.continue_button);
        continuebutton.setOnClickListener(this);
        View difficultybutton=findViewById(R.id.difficulty_button);
        difficultybutton.setOnClickListener(this);
        View newbutton=findViewById(R.id.new_button);
        newbutton.setOnClickListener(this);
        View recordsbutton=findViewById(R.id.records_button);
        recordsbutton.setOnClickListener(this);
        View quitbutton=findViewById(R.id.quit_button);
        quitbutton.setOnClickListener(this);
    }
    
    /*When "new game is pressed, this function should be called"*/
    private void startgame(){
    	//create Game activity
    	Intent i = new Intent(this,Game.class);
    	startActivity(i);
    }
    private void continuegame(){
    	// to be implemented
    }
    private void choosedifficulty(){
    	// to be implemented
    }
    private void showrecords(){
    	// to be implemented
    }
    public void onClick(View v){
    	switch (v.getId()){
    	case R.id.new_button:
    		startgame();
    	case R.id.continue_button:
    		continuegame();
    	case R.id.difficulty_button:
    		choosedifficulty();
    	case R.id.records_button:
    		showrecords();
    	case R.id.quit_button:
    		finish();
    		break;
    	}
    }
}