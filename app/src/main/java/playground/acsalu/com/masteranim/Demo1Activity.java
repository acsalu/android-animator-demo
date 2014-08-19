package playground.acsalu.com.masteranim;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Demo1Activity extends Activity {

    TextView mAnimatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        mAnimatedText = (TextView) findViewById(R.id.text_animated);
    }

    public void startAnimation(View v) {
        ValueAnimator va = new ValueAnimator();
        va.setObjectValues(0, 100);
        va.setDuration(100 * 1000); // duration in ms.
//        va.setInterpolator(new LinearInterpolator());
        va.setInterpolator(new AccelerateDecelerateInterpolator());
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer number = (Integer) valueAnimator.getAnimatedValue();
                mAnimatedText.setText(number.toString());
            }
        });

        va.start();
    }
}
