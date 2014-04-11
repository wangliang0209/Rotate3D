package com.android.rotate.gridview;

import com.android.rotate.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GridAdapter extends BaseAdapter {

	private Context mCtx;
	
	public GridAdapter(Context ctx) {
		mCtx = ctx;
	}
	
	@Override
	public int getCount() {
		return 10;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(null == convertView) {
			convertView = LayoutInflater.from(mCtx).inflate(R.layout.grid_item, null);
		}
		return convertView;
	}

}
