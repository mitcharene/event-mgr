package com.marene.eventmgr.customdrawables;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class CircularBitmapDrawable extends Drawable {

	private final RectF mRect = new RectF();

	private final BitmapShader mBitmapShader;

	private final Paint mPaint;

	private final int mBitmapWidth;
	private final int mBitmapHeight;
	private final int mDiameter;

	public CircularBitmapDrawable(Bitmap bitmap, float cornerRadius, int margin) {

		mBitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP,
				Shader.TileMode.CLAMP);

		mPaint = new Paint();
		mPaint.setAntiAlias(true);
		mPaint.setShader(mBitmapShader);
		mPaint.setDither(true);

		mBitmapWidth = bitmap.getWidth();
		mBitmapHeight = bitmap.getHeight();

		mDiameter = Math.min(mBitmapHeight, mBitmapWidth);
		mRect.set(0, 0, mDiameter, mDiameter);
	}

	// @Override
	// protected void onBoundsChange(Rect bounds) {
	// super.onBoundsChange(bounds);
	// // mRect.set(mMargin, mMargin, bounds.width() - mMargin, bounds.height()
	// // - mMargin);
	// // mOval.resize(mCornerRadius, mCornerRadius);
	//
	// if (USE_VIGNETTE) {
	// RadialGradient vignette = new RadialGradient(mRect.centerX(),
	// mRect.centerY() * 1.0f / 0.7f, mRect.centerX() * 1.3f,
	// new int[] { 0, 0, 0x7f000000 }, new float[] { 0.0f, 0.7f,
	// 1.0f }, Shader.TileMode.CLAMP);
	//
	// Matrix oval = new Matrix();
	// oval.setScale(1.0f, 0.7f);
	// vignette.setLocalMatrix(oval);
	//
	// mPaint.setShader(new ComposeShader(mBitmapShader, vignette,
	// PorterDuff.Mode.SRC_OVER));
	// }
	// }

	@Override
	public void draw(Canvas canvas) {

		// canvas.drawOval(mRect, mPaint);
		// getCroppedBitmap(mBitmap, canvas);
		canvas.drawCircle(mBitmapWidth / 2, mBitmapHeight / 2, mDiameter / 2,
				mPaint);
	}

	@Override
	public int getOpacity() {
		return PixelFormat.TRANSLUCENT;
	}

	@Override
	public void setAlpha(int alpha) {
		mPaint.setAlpha(alpha);
	}

	@Override
	public void setColorFilter(ColorFilter cf) {
		mPaint.setColorFilter(cf);
	}

	@Override
	public int getIntrinsicWidth() {
		return mBitmapWidth;
	}

	@Override
	public int getIntrinsicHeight() {
		return mBitmapHeight;
	}

	public Bitmap getCroppedBitmap(Bitmap bitmap, Canvas canvas) {
		Bitmap output = Bitmap.createBitmap(bitmap.getWidth(),
				bitmap.getHeight(), Config.ARGB_8888);
		// Canvas canvas = new Canvas(output);
		canvas.setBitmap(output);

		final int color = 0xff424242;
		final Paint paint = new Paint();
		final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());

		paint.setAntiAlias(true);
		canvas.drawARGB(0, 0, 0, 0);
		mPaint.setColor(color);
		// canvas.drawRoundRect(rectF, roundPx, roundPx, paint);
		canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2,
				bitmap.getWidth() / 2, mPaint);
		// paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
		canvas.drawBitmap(bitmap, rect, rect, mPaint);
		// Bitmap _bmp = Bitmap.createScaledBitmap(output, 60, 60, false);
		// return _bmp;
		return output;
	}
}
