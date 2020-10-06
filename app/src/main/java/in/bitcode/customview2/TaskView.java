package in.bitcode.customview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class TaskView extends androidx.appcompat.widget.AppCompatTextView {

    private boolean mIsDone;
    Paint mPaint;

    public TaskView(Context context) {
        super(context);
        init();
    }

    public TaskView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setPadding(80, 10, 20, 10);
        setTextSize(20);
        mIsDone = false;
        mPaint = new Paint();
        mPaint.setColor(Color.RED);

        setOnClickListener(new OnTaskViewClickListener());
    }

    private class OnTaskViewClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            mIsDone = !mIsDone;
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(40, 0, 40, getHeight(), mPaint);
        canvas.drawLine(60, 0, 60, getHeight(), mPaint);

        if (mIsDone) {
            canvas.drawLine(0, getHeight() / 2, getRight(), getHeight() / 2, mPaint);
        }
    }

    public boolean isDone() {
        return mIsDone;
    }


}
