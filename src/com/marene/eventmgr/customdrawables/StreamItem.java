package com.marene.eventmgr.customdrawables;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class StreamItem {
	public final Bitmap mBitmap;

	public StreamItem(Context c, int resid) {
		mBitmap = BitmapFactory.decodeResource(c.getResources(), resid);
	}
}
