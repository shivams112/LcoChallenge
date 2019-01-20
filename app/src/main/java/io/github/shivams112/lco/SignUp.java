package io.github.shivams112.lco;

import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private LinearLayout layout ;
    private MaterialButton signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        layout = findViewById(R.id.details);
        signUp = findViewById(R.id.signUp);
        translateButton();
        layout.setRotation(-90);
        layout.animate()
                .setDuration(500)
                .rotation(0);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "SignUp Tapped", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        layout.setPivotX(layout.getWidth() / 2);
        layout.setPivotY(layout.getHeight());
    }

    private void translateButton(){
        Animation animation = new TranslateAnimation(-1000, 0,0, 0);
        animation.setDuration(300);
        signUp.startAnimation(animation);
    }
}
