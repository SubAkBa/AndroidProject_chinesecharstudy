package com.example.sonwo.third;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.*;
import android.widget.Toast;

public class PaintBoard extends View {
    Paint paint = new Paint();
    Path path = new Path();

    private long pressedTime = 0;

    public PaintBoard(Context context, AttributeSet attrs){
        super(context, attrs);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                break;
            case MotionEvent.ACTION_UP:
                if (System.currentTimeMillis() > pressedTime + 200)
                    pressedTime = System.currentTimeMillis();
                else
                    path.rewind();

                break;
        }

        invalidate();

        return true;
    }
}