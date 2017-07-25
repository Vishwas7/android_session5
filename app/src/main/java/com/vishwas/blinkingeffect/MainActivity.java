package com.vishwas.blinkingeffect;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaring variable
    private TextView txt;
    private Button blinkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // In here getting the widgets reference from XML layout
        txt = (TextView) findViewById(R.id.textView);
        blinkBtn = (Button) findViewById(R.id.button);

        blinkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manageBlinkEffect();

            }
        });
    }

    /*using manageBlinkEffect method */
    private void manageBlinkEffect() {
        ObjectAnimator anim = ObjectAnimator.ofInt(txt, "TextColor", R.color.NavajoWhite,Color.RED, R.color.NavajoWhite);
        anim.setDuration(1000);// In here setting duration
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(Animation.REVERSE);//In here setting repeat mode.
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();//stat animation


    }
}


