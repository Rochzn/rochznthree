package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoact extends AppCompatActivity {

        private VideoView videoView;
        private Button btn_start, btn_end;
        private MediaController mediaController;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.video);
            initView();
        }
    private void init() {
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        String uri = "C:\\Users\\Administrator\\Desktop\\新建文件夹\\QLDownload\\书店"+getPackageName()+ "/" +R.raw.shudian;
        videoView.setVideoURI(Uri.parse(uri));
        videoView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoView);
        videoView.requestFocus();
        videoView.start();
    }
        private void initView() {
            videoView = (VideoView) findViewById(R.id.videoView);
            btn_start = (Button) findViewById(R.id.btn_start);
            btn_end = (Button) findViewById(R.id.btn_end);


            btn_start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    init();
                }
            });
            btn_end.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    videoView.stopPlayback();
                }
            });
        }
    }
