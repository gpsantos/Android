package guilherme.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstAppActivity extends Activity {
	
	public String add_button = "";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void doTheMath(View v) {
		EditText text1 = (EditText) findViewById(R.id.editText1);
		EditText text2 = (EditText) findViewById(R.id.editText2);
		int result = Integer.valueOf(text1.getText().toString()).intValue()
				+ Integer.valueOf(text2.getText().toString()).intValue();

		v.setBackgroundColor(Color.BLUE);
	}
}