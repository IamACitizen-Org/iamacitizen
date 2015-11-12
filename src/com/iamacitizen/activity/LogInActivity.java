package com.iamacitizen.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.iamacitizen.activity.R;

public class LogInActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.log_in);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log_in, menu);
		return true;
	}
	
	public void logIn(View v) {
		Intent intent = new Intent(this, AnnouncementsActivity.class);
		startActivity(intent);
	}
	
	public void goToSignUpActivity(View v) {
		Intent intent = new Intent(this, SignUpActivity.class);
		startActivity(intent);
	}

}
