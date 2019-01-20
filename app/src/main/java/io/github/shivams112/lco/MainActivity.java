package io.github.shivams112.lco;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mLinearLayout;
    MaterialButton loginn,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mLinearLayout.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade));
//        loginn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade));
        translateButton();
        signup.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade));

        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login Tapped", Toast.LENGTH_SHORT).show();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent, options.toBundle());
            }
        });
    }

    private void initViews()
    {
        mLinearLayout = findViewById(R.id.details);
        loginn = findViewById(R.id.sign_in);
        signup = findViewById(R.id.sign_up);

    }

    private void translateButton(){
        Animation animation = new TranslateAnimation(-1000, 0,0, 0);
        animation.setDuration(300);
        loginn.startAnimation(animation);
    }
}
