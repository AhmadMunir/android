package com.example.HelloToast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount = (TextView) findViewById(R.id.show_count);
        if (mShowCount != null){
            mShowCount.setText(Integer.toString((mCount)));
            if(mCount %10 == 0){
                Log.d("MainActivity", mCount + " itu kelipatan 10 :v");
            }

        }

    }
    public void resetCount(View view) {
        if (mCount != 0){
        mShowCount.setText(Integer.toString(0));
        mCount = 0;
        Log.d("MainActivity", "Hitungan Di reset");
        }
    }

}
