package com.iamacitizen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.iamacitizen.activity.asynctask.ExecuteWebClientDoPostTask;
import com.iamacitizen.converter.AnnouncementConverter;
import com.iamacitizen.model.Announcement;

public class NewAnnouncementActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_announcement);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.new_announcement, menu);
		return true;
	}

	public void createNewAnnouncement(View v) {

		EditText country = (EditText) findViewById(R.id.country);
		EditText state = (EditText) findViewById(R.id.state);
		EditText city = (EditText) findViewById(R.id.city);
		EditText title = (EditText) findViewById(R.id.title);
		EditText description = (EditText) findViewById(R.id.description);
		EditText institutionArea = (EditText) findViewById(R.id.institution_area);
		EditText institution = (EditText) findViewById(R.id.institution);
		RadioButton publicSector = (RadioButton) findViewById(R.id.public_sector);

		// TODO: annoucement type and institution type
		Announcement announcement = new Announcement(
				title.getText().toString(), description.getText().toString(),
				country.getText().toString(), state.getText().toString(), city
						.getText().toString(), "public", institutionArea
						.getText().toString(), "public", institution.getText()
						.toString());
		
		AnnouncementConverter converter = new AnnouncementConverter();

		new ExecuteWebClientDoPostTask(converter.toJSON(announcement))
				.execute("http://10.0.2.2:8080/iamacitize-web-1.0-SNAPSHOT/iamacitizen/announcements/announcement");

		Intent intent = new Intent(this, AnnouncementsActivity.class);
		startActivity(intent);
	}

}
