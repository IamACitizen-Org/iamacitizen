package com.iamacitizen.activity.asynctask;

import com.iamacitizen.web.WebClient;

import android.os.AsyncTask;

public class ExecuteWebClientDoPostTask extends AsyncTask<String, Void, String> {
	
	private String json;
	
	public ExecuteWebClientDoPostTask(String json) {
		this.json = json;
	}

	@Override
	protected String doInBackground(String... url) {
		WebClient webClient = new WebClient(url[0]);
		return webClient.doPost(json);
	}


}
