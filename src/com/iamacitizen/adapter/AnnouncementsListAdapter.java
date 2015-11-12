package com.iamacitizen.adapter;

import java.util.List;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.iamacitizen.activity.R;
import com.iamacitizen.model.Announcement;

public class AnnouncementsListAdapter extends BaseAdapter {

	private final Activity activity;
	private final List<Announcement> announcements;

	public AnnouncementsListAdapter(Activity activity,
			List<Announcement> announcements) {
		this.activity = activity;
		this.announcements = announcements;
	}

	@Override
	public int getCount() {
		return announcements.size();
	}

	@Override
	public Object getItem(int position) {
		return announcements.get(position);
	}

	@Override
	public long getItemId(int position) {
		return announcements.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = activity.getLayoutInflater().inflate(R.layout.announcement,
				null);

		Announcement announcement = announcements.get(position);

		TextView title = (TextView) view.findViewById(R.id.title);
		title.setText(announcement.getTitle());

		TextView description = (TextView) view.findViewById(R.id.description);
		description.setText(announcement.getDescription());

		TextView repudiations = (TextView) view.findViewById(R.id.repudiations);
		repudiations.setText(announcement.getRepudiations().toString());

		ImageView photo = (ImageView) view.findViewById(R.id.photo);
		photo.setImageBitmap(BitmapFactory.decodeByteArray(
				announcement.getPhoto(), 0, announcement.getPhoto().length));

		return view;
	}

}
