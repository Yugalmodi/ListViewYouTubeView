package com.techpalle.listviewyoutubeviewassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ThirdActivity extends
//        AppCompatActivity{
        YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
    TextView textView;
    YouTubePlayerView youTubePlayerView;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView = (TextView) findViewById(R.id.third_page_text_view);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtbe_player_view);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        data = b.getString("key");
        textView.setText(data);
        youTubePlayerView.initialize("AIzaSyAu364wMvEzK_KrphDI0KUGQMN6_6eCWAM", this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo(data);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }
}
