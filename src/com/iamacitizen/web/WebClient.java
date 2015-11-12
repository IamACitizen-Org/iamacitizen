package com.iamacitizen.web;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class WebClient {

	private final String URL;

	public WebClient(String URL) {
		this.URL = URL;
	}

	public String doGet()  {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(URL);
		httpGet.setHeader("Accept", "application/json");
		String jsonResponse;
		try {
			HttpResponse response = httpClient.execute(httpGet);
			jsonResponse = EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return jsonResponse;
	}
	
	public String doPost(String json)  {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(URL);
		String jsonResponse;
		
		try {
			httpPost.setEntity(new StringEntity(json));
			httpPost.setHeader("Accept", "application/json");
			httpPost.setHeader("Content-type", "application/json");
			HttpResponse response = httpClient.execute(httpPost);
			jsonResponse = EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return jsonResponse;
	}

}
