package com.iamacitizen.activity;

import android.os.Bundle;
import android.view.Menu;

public class InstitutionRankingByMobilisationFollowerActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.institution_ranking_by_mobilisation_follower);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(
				R.menu.institution_ranking_by_mobilisation_follower, menu);
		return true;
	}

}
