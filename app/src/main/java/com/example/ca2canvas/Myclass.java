package com.example.ca2canvas;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

public class Myclass extends View   {
    Paint p;
int x=0;
    public Myclass(Context context) {
        super(context);

        call();

    }

    void call() {
        p = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.YELLOW);
        p.setColor(Color.WHITE);
        p.setStrokeWidth(40);
        p.setColor(Color.CYAN);
        canvas.drawRect(350+x,400,800+x,600,p);
        canvas.drawRect(200+x,600,1000+x,1000,p);
        p.setColor(Color.BLACK);
        canvas.drawCircle(240+x,1000,100,p);
        p.setColor(Color.BLACK);
        canvas.drawCircle(890+x,1000,100,p);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_MOVE:
                float xAxis=event.getX();
                float yAxis=event.getY();
                if(xAxis>200+x && xAxis<600+x && yAxis>400 && yAxis<1000){
                    x=x-10;
                }
                else if(xAxis>600+x && xAxis<1000+x && yAxis>400 && yAxis<1000)
                {
                    x=x+10;
                }
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                   break;

    }
    return  true;
    }
}


