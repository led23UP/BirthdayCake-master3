package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener{
    private CakeView CakeViewObj;
    private CakeModel CakeModelObj;
    public CakeController(CakeView obj)
    {
        CakeViewObj = obj;
        CakeModelObj = obj.getCakes();
    }

    @Override
    public void onClick(View v) {
        Log.d("myTag","This is my message");

        if(v.getId()==R.id.blowOutButton)
        {
            CakeModelObj.candleLit = !CakeModelObj.candleLit;
        }
        CakeViewObj.invalidate();
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(compoundButton.getId() == R.id.candleSwitch)
        {
            Log.d("myTag","This is my message2");
            if(isChecked)
            {
                CakeModelObj.candles = !CakeModelObj.candles;

            }
            else
            {
                CakeModelObj.candles = !CakeModelObj.candles;
            }
        }
        CakeViewObj.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        CakeModelObj.candleNum = progress;
        CakeViewObj.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
