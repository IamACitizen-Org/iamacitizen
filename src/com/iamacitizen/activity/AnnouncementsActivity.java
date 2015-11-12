package com.iamacitizen.activity;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.json.JSONException;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.iamacitizen.activity.asynctask.ExecuteWebClientDoGetTask;
import com.iamacitizen.adapter.AnnouncementsListAdapter;
import com.iamacitizen.converter.AnnouncementConverter;
import com.iamacitizen.model.Announcement;

public class AnnouncementsActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.announcements);
		try {
			loadAnnouncements();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.announcements, menu);
		return true;
	}

	public void goToNewAnnouncementActivity(View v) {
		Intent intent = new Intent(this, NewAnnouncementActivity.class);
		startActivity(intent);
	}

	public void repudiate(View view) {

	}

	private void loadAnnouncements() throws JSONException, InterruptedException, ExecutionException  {
		AsyncTask<String, Void, String> webClientTask = new ExecuteWebClientDoGetTask()
				.execute("http://10.0.2.2:8080/iamacitize-web-1.0-SNAPSHOT/iamacitizen/announcements/list");
		
		AnnouncementConverter announcementConverter = new AnnouncementConverter();
		
		List<Announcement> announcements = announcementConverter
				.toList(webClientTask.get());

		AnnouncementsListAdapter adapter = new AnnouncementsListAdapter(this,
				announcements);

		ListView announcementsList = (ListView) findViewById(R.id.announcements);

		announcementsList.setAdapter(adapter);
	}

}
