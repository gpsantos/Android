package guilherme.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.RemoteViews.ActionException;

public class FirstAppActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		findViewById(R.id.button1).setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent motionEvent) {
				if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
//					EditText edit = (EditText) findViewById(R.id.editText1);
					int x = (int) motionEvent.getRawX();
					int y = (int) motionEvent.getRawY();
					v.layout(x, y - v.getHeight(), x + v.getWidth(), y);
					// edit.setText(String.valueOf(y));
					return true;
				}
				return false;
			}
		});
	}

	public void doTheMath(View v) {
		EditText text1 = (EditText) findViewById(R.id.editText1);
		EditText text2 = (EditText) findViewById(R.id.editText2);
		if (text1.getText().toString().length() > 0 && text2.getText().toString().length() > 0) {
			int result = Integer.valueOf(text1.getText().toString()) + Integer.valueOf(text2.getText().toString());
			text1.setText(String.valueOf(result));
		}
	}
}