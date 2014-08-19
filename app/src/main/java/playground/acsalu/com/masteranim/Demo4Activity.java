package playground.acsalu.com.masteranim;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Demo4Activity extends Activity {

    private View mCircleAnimatedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo4);

        mCircleAnimatedView = findViewById(R.id.view_circle_animated);
    }

    public void startAnimation(View v) {

        ValueAnimator va = new ValueAnimator();

        va.setObjectValues(0.0f, 500.0f);
        va.setDuration(2000);
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                /**
                 * Parametric equation for a parabola (t)
                 * x = t, y = 0.07 * t * 2
                 */
                float t = (Float) valueAnimator.getAnimatedValue();
                mCircleAnimatedView.setX(t);
                mCircleAnimatedView.setY(0.007f * t * t);
            }
        });

        va.start();

    }
}
