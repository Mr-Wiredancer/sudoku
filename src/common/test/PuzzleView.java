package common.test;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;

//This is the file which generates the board
public class PuzzleView extends View {
    /** Called when the activity is first created. */
	private ShapeDrawable mDrawable;
	
    public PuzzleView(Context context)
    {
    	super(context);
    	
    	mDrawable = new ShapeDrawable(new OvalShape());
    	int x=10;
    	int y=10;
    	int width=300;
    	int height=50;
    	
    	mDrawable.getPaint().setColor(0xff74AC23);
        mDrawable.setBounds(x, y, x + width, y + height);

    }

    protected void onDraw(Canvas canvas) {
        mDrawable.draw(canvas);
    }
}