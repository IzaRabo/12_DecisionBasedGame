package mcm.edu.ph.a12_decisionbasedgame;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mprogressBar;
    private TextView mloadingText;

    private int mprogressStatus = 0;

    private Handler mHandler = new Handler();

    Button btn1, btn2, btn3, btn4;
    TextView text;
    ImageView image;

    Story story = new Story(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_main);

        mprogressBar = (ProgressBar) findViewById(R.id.progressBar);
        mloadingText = (TextView) findViewById(R.id.txt);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mprogressStatus < 100) {
                    mprogressStatus++;
                    android.os.SystemClock.sleep(50);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mprogressBar.setProgress(mprogressStatus);

                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mloadingText.setVisibility(View.VISIBLE);
                    }
                });


            }


        });



        text = findViewById(R.id.textView);

        image = (ImageView)findViewById(R.id.storyimageView);
        btn1 = (Button) findViewById(R.id.btnChoice1);
        btn2 = (Button) findViewById(R.id.btnChoice2);
        btn3 = (Button) findViewById(R.id.btnChoice3);
        btn4 = (Button) findViewById(R.id.btnChoice4);

        btn1.setTransformationMethod(null);
        btn2.setTransformationMethod(null);
        btn3.setTransformationMethod(null);
        btn4.setTransformationMethod(null);

        story.startingPoint();
    }

    public void setBtn1(View view) {

        story.selectPage(story.nextPage1);
    }

    public void setBtn2(View view) {

        story.selectPage(story.nextPage2);
    }

    public void setBtn3(View view) {

        story.selectPage(story.nextPage3);
    }

    public void setBtn4(View view) {

        story.selectPage(story.nextPage4);
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
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            );

        }

    }
}