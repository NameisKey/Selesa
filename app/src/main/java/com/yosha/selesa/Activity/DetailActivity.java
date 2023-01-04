package com.yosha.selesa.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.yosha.selesa.R;

public class DetailActivity extends AppCompatActivity {
    private TextView tvDetailJudul, tvDetailKota, tvDetailLuas, tvDetailTglDibangun, tvDetailDeskripsi;
    private YouTubePlayerView ypvVideo;
    private Button btnMap;
    private String detailJudul, detailKota, detailLuas, detailTglDibangun, detailDeskripsi, videoId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvDetailJudul = findViewById(R.id.tv_detail_judul);
        tvDetailKota = findViewById(R.id.tv_detail_kota);
        tvDetailLuas = findViewById(R.id.tv_detail_luas);
        tvDetailTglDibangun = findViewById(R.id.tv_detail_tgl_dibangun);
        tvDetailDeskripsi = findViewById(R.id.tv_detail_deskripsi);

        ypvVideo = findViewById(R.id.ypv_video);
        btnMap = findViewById(R.id.btn_map);

        Intent getIntent = getIntent();
        detailJudul = getIntent.getStringExtra("xJudul");
//        detailDeskripsi = getIntent.getStringExtra("xDeskripsi");
//        detailKota = getIntent.getStringExtra("xKota");
//        detailLuas = getIntent.getStringExtra("xLuas");
//        detailTglDibangun = getIntent.getStringExtra("xTglDibangun");
//        videoId = getIntent.getStringExtra("xVideoId");

        tvDetailJudul.setText(detailJudul);
//        tvDetailDeskripsi.setText(detailDeskripsi);
//        tvDetailLuas.setText(detailLuas);
//        tvDetailKota.setText(detailKota);
//        tvDetailTglDibangun.setText(detailTglDibangun);

        ypvVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.cueVideo(videoId, 0);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ypvVideo.release();
    }
}