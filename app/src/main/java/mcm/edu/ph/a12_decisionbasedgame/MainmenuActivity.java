package mcm.edu.ph.a12_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainmenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_mainmenu);


        //button IDs and listeners
        Button btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        //Main buttons for next activities
        switch (v.getId()) {

            case R.id.button:
                startActivity(new Intent(MainmenuActivity.this, MainActivity.class));//When button is touched, it will take you to the start of the game
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;

            case R.id.button2:
                startActivity(new Intent(MainmenuActivity.this, Settings.class));//When button is touched, it will take you to the settings
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;

            case R.id.button3:
                startActivity(new Intent(MainmenuActivity.this, credits.class));//When button is touched, it will take you to the settings
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
}

