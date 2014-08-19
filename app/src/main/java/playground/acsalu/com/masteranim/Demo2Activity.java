package playground.acsalu.com.masteranim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;


public class Demo2Activity extends Activity {

    private static final String TAG = "demo2";
    private View mAnimatedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        mAnimatedView = findViewById(R.id.view_animated);
    }

    public void startAnimation(View v) {

        ObjectAnimator translationAnimator =
                ObjectAnimator.ofFloat(mAnimatedView, "x", 0.0f, getWindow().getDecorView().getWidth() - mAnimatedView.getWidth());
        translationAnimator.setDuration(1000);
//        translationAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        translationAnimator.setInterpolator(new BounceInterpolator());

//        translationAnimator.start();

        translationAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                Log.d(TAG, "before start: " + mAnimatedView.getX());
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                Log.d(TAG, "before end: " + mAnimatedView.getX());
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });


//        translationAnimator.start();

        ObjectAnimator alphaAnimator =
                ObjectAnimator.ofFloat(mAnimatedView, "alpha", 1.0f, 0.0f);
        alphaAnimator.setDuration(500);
        alphaAnimator.setRepeatCount(1);
        alphaAnimator.setRepeatMode(Animation.REVERSE);
//        alphaAnimator.start();

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(translationAnimator).with(alphaAnimator);
        animatorSet.start();

    }
}
