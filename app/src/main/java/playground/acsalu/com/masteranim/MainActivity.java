package playground.acsalu.com.masteranim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToDemo1(View v) {
        Intent intent = new Intent(this, Demo1Activity.class);
        startActivity(intent);
    }

    public void navigateToDemo2(View v) {
        Intent intent = new Intent(this, Demo2Activity.class);
        startActivity(intent);
    }

    public void navigateToDemo3(View v) {
        Intent intent = new Intent(this, Demo3Activity.class);
        startActivity(intent);
    }

    public void navigateToDemo4(View v) {
        Intent intent = new Intent(this, Demo4Activity.class);
        startActivity(intent);
    }

}
