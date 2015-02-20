package com.marene.eventmgr.view;

import com.marene.eventmgr.customdrawables.StreamItem;
import com.marene.eventmgr.customdrawables.CircularBitmapDrawable;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class StreamAdapter extends ArrayAdapter<StreamItem> {
	private static final int CORNER_RADIUS = 24; // dips
	private static final int MARGIN = 5; // dips

	private final int mCornerRadius;
	private final int mMargin;
	private final LayoutInflater mInflater;

	public StreamAdapter(Context context) {
		super(context, 0);
		
		final float density = context.getResources().getDisplayMetrics().density;
		mCornerRadius = (int) (CORNER_RADIUS * density + 0.5f);
		mMargin = (int) (MARGIN * density + 0.5f);

		mInflater = LayoutInflater.from(getContext());
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = null;
		
		if (convertView == null) {
			imageView = new ImageView(getContext());
            //imageView.setLayoutParams(new GridView.LayoutParams(25, 25));
			imageView.setLayoutParams(parent.getLayoutParams());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
		} else {
			imageView = (ImageView) convertView;
		}

		StreamItem item = getItem(position);

		CircularBitmapDrawable d = new CircularBitmapDrawable(item.mBitmap, mCornerRadius, mMargin);
		imageView.setImageDrawable(d);

		int w = item.mBitmap.getWidth();
		int h = item.mBitmap.getHeight();

		float ratio = w / (float) h;

		return imageView;
	}
}