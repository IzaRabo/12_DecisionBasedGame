package mcm.edu.ph.a12_decisionbasedgame;

import static android.content.ContentValues.TAG;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import com.example.group14_decisionbasedgame.R;
//import com.example.group14_decisionbasedgame.controller.brelated;
//import com.example.group14_decisionbasedgame.controller.getProgressBar;
//import com.example.group14_decisionbasedgame.controller.musicRelated;


public class loadingscreen extends AppCompatActivity {
    //TODO: make a corrupted version of the music for loading screen and main menu as the plot twist is reached. Probably will have a boolean that is checked everytime the game is started? to change the music and bg picture
    ProgressBar progressBar;
    TextView textView;
    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout. loadingcreen);

        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.txt);
        background = findViewById(R.id.white1);

        progressBar.setMax(100);
        progressBar.setScaleY(2f);
        progressAnimation();

        //musicRelated.strtLscreen(this);
        brelated.Lscreen_bgRandom(background);
    }

    private void progressAnimation() {

        progBar animation =  new progBar(this,textView,progressBar,0f,100f, MainActivity.class);
        animation.setDuration(8000);
        progressBar.setAnimation(animation);

    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Lscreen onPause: working");
    }

}