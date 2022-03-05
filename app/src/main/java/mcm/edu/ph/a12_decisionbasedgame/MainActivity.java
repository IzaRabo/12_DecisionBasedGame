package mcm.edu.ph.a12_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    TextView text;

    Story story = new Story(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);

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