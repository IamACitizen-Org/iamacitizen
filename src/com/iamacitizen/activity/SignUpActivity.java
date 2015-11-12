package com.iamacitizen.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.iamacitizen.activity.R;

public class SignUpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sing_up);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sing_up, menu);
		return true;
	}

}
