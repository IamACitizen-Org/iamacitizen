package com.iamacitizen.activity;

import android.os.Bundle;
import android.view.Menu;

public class MobilisationsByInstitutionActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mobilisations_by_institution);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.mobilisations_by_institution, menu);
		return true;
	}

}
