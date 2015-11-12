package com.iamacitizen.activity.asynctask;

import android.os.AsyncTask;

import com.iamacitizen.web.WebClient;

public class ExecuteWebClientDoGetTask extends AsyncTask<String, Void, String> {

	@Override
	protected String doInBackground(String... url) {
		WebClient webClient = new WebClient(url[0]);
		return webClient.doGet();
	}

}
