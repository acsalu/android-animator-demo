package playground.acsalu.com.masteranim;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class Demo3Activity extends Activity {

    private static final String TAG = "demo2";
    private View mAnimatedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        mAnimatedView = findViewById(R.id.view_animated);
    }

    public void startAnimation(View v) {

        AnimatorInflater animatorInflater = new AnimatorInflater();
        AnimatorSet s = (AnimatorSet) animatorInflater.loadAnimator(this, R.animator.demo3);
        s.setTarget(mAnimatedView);
        s.start();
    }
}
