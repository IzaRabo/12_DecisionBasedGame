package mcm.edu.ph.a12_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class credits extends AppCompatActivity implements View.OnClickListener {

    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_credits);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(this);

    }

        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnback:
                    startActivity(new Intent(credits.this, MainmenuActivity.class));
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;
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

