package com.example.miger.streampicam;

/**
 * Created by chipu on 11/04/19.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.mediaplayer.R;


public class MainActivity extends AppCompatActivity {
    EditText addrField;
    Button btnConnect;
    VideoView streamView;
    MediaController mediaController;

    public MainActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.addrField = (EditText) this.findViewById(R.id.addr);
        this.btnConnect = (Button)this.findViewById(R.id.connect);
        this.streamView = (VideoView)this.findViewById(R.id.streamview);

        this.btnConnect.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String s = MainActivity.this.addrField.getEditableText().toString();
                MainActivity.this.playStream(s);
            }
        });
    }

    private void playStream(String src){
        Uri UriSrc = Uri.parse(src);
        if(UriSrc == null){
            Toast.makeText(MainActivity.this,
                    "UriSrc == null", Toast.LENGTH_LONG).show();
        }else{
            streamView.setVideoURI(UriSrc);
            mediaController = new MediaController(this);
            streamView.setMediaController(mediaController);
            streamView.start();

            Toast.makeText(MainActivity.this,
                    "Connect: " + src,
                    Toast.LENGTH_LONG).show();
        }
    }



    protected void onDestroy() {
       super.onDestroy();
        this.streamView.stopPlayback();
    }
}


