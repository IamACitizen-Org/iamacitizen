package com.iamacitizen.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MobilisationsByUserActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mobilisations_by_user);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.my_mobilisations, menu);
		return true;
	}

}
