package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeview = findViewById(R.id.cakeview);
        CakeController cakecontroller= new CakeController(cakeview);

        Button blowOutButton = (Button) findViewById(R.id.blowOutButton);

        Switch candleSwitch = (Switch) findViewById(R.id.candleSwitch);

        SeekBar candleSeekBar = (SeekBar) findViewById(R.id.candleSeekBar);

        candleSwitch.setOnCheckedChangeListener(cakecontroller);
        blowOutButton.setOnClickListener(cakecontroller);
        candleSeekBar.setOnSeekBarChangeListener(cakecontroller);
    }
    public void goodbye(View button) {
        //Log.i("button","goodbye");

    }
}
