package com.example.miger.streampicam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.VideoView;

import com.example.mediaplayer.R;

/**
 * Created by chipu on 11/04/19.
 */

public class MonitorHello extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monitor_hello);
        Thread thread = new Thread(){
            public void run()
            {
                try {
                    sleep(3000);
                } catch (Exception e) {

                }
                finally
                {
                    Intent intent=new Intent(MonitorHello.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }


    protected void onPause(){
        super.onPause();
        finish();
    }
}



