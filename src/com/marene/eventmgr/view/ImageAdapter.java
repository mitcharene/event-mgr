package com.marene.eventmgr.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.marene.eventmgr.R;
import com.marene.eventmgr.customdrawables.CircularBitmapDrawable;
import com.marene.eventmgr.customdrawables.StreamItem;

public class ImageAdapter extends BaseAdapter {
	private static final int CORNER_RADIUS = 24; // dips
	private static final int MARGIN = 12; // dips

	private Context mContext;
	private float mCornerRadius;
	private int mMargin;

	public ImageAdapter(Context c) {
		mContext = c;
		final float density = c.getResources().getDisplayMetrics().density;
		mCornerRadius = (int) (CORNER_RADIUS * density + 0.5f);
		mMargin = (int) (MARGIN * density + 0.5f);
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if (convertView == null) {
			// if it's not recycled, initialize some attributes
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(50, 50));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

		} else {
			imageView = (ImageView) convertView;
		}

		StreamItem item = new StreamItem(mContext, mThumbIds[position]);
		CircularBitmapDrawable d = new CircularBitmapDrawable(item.mBitmap,
				mCornerRadius, mMargin);
		imageView.setImageDrawable(d);
		return imageView;
	}

	// references to our images
	private int[] mThumbIds = { R.drawable.sample_2, R.drawable.sample_3,
			R.drawable.sample_4, R.drawable.sample_5,
	/*
	 * R.drawable.sample_6, R.drawable.sample_7, R.drawable.sample_0,
	 * R.drawable.sample_1, R.drawable.sample_2, R.drawable.sample_3,
	 * R.drawable.sample_4, R.drawable.sample_5, R.drawable.sample_6,
	 * R.drawable.sample_7, R.drawable.sample_0, R.drawable.sample_1,
	 * R.drawable.sample_2, R.drawable.sample_3, R.drawable.sample_4,
	 * R.drawable.sample_5, R.drawable.sample_6, R.drawable.sample_7
	 */
	};
}
