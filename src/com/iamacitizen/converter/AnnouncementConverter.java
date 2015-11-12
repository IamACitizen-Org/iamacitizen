package com.iamacitizen.converter;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import android.util.Base64;

import com.iamacitizen.model.Announcement;

public class AnnouncementConverter {

	public String toJSON(List<Announcement> announcements) {
		return null;
	}

	// TODO: get User loged in to set the real username and get photo
	public String toJSON(Announcement announcement) {
		JSONStringer jsonStringer = new JSONStringer();
		try {
			jsonStringer.object()
					.key("country").value(announcement.getCountry())
					.key("state").value(announcement.getState()).key("city")
					.value(announcement.getCity()).key("username")
					.value("manoel").key("announcementType")
					.value(announcement.getType()).key("title")
					.value(announcement.getTitle()).key("description")
					.value(announcement.getDescription())
					.key("institutionArea")
					.value(announcement.getInstitutionArea())
					.key("institutionType")
					.value(announcement.getInstitutionType())
					.key("institution").value(announcement.getInstitution())
					.key("photo").value("null")
					.endObject();
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
		return jsonStringer.toString();
	}

	public List<Announcement> toList(String json) throws JSONException {
		List<Announcement> result = new ArrayList<Announcement>();

		JSONArray announcementsJSON = new JSONArray(json);

		for (int i = 0; i < announcementsJSON.length(); i++) {
			JSONObject announcement = announcementsJSON.getJSONObject(i);
			String title = announcement.getString("title");
			String description = announcement.getString("description");

			byte[] photo = Base64.decode(announcement.getString("photo"),
					Base64.DEFAULT);

			result.add(new Announcement((long) i, title, description, (long) i,
					photo));
		}

		return result;

	}

}
