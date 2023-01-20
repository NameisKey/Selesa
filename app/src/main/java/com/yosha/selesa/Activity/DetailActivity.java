package com.yosha.selesa.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.yosha.selesa.R;

public class DetailActivity extends AppCompatActivity {
    ActionBar actionBar;
    private TextView tvDetailJudul, tvDetailKota, tvDetailLuas, tvDetailTglDibangun, tvDetailDeskripsi;
    private YouTubePlayerView ypvVideo;
    private Button btnMap;
    private String detailJudul, detailKota, detailLuas, detailTglDibangun, detailDeskripsi, videoId, detailLokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvDetailJudul = findViewById(R.id.tv_detail_judul);
        tvDetailKota = findViewById(R.id.tv_detail_kota);
        tvDetailLuas = findViewById(R.id.tv_detail_luas);
        tvDetailTglDibangun = findViewById(R.id.tv_detail_tgl_dibangun);
        tvDetailDeskripsi = findViewById(R.id.tv_detail_deskripsi);

        ypvVideo = findViewById(R.id.ypv_video);
        btnMap = findViewById(R.id.btn_map);

        Intent getIntent = getIntent();
        detailJudul = getIntent.getStringExtra("xJudul");
        detailDeskripsi = getIntent.getStringExtra("xDeskripsi");
        detailKota = getIntent.getStringExtra("xKota");
        detailLuas = getIntent.getStringExtra("xLuas");
        detailTglDibangun = getIntent.getStringExtra("xTglDibangun");
        videoId = getIntent.getStringExtra("xVideoId");
        detailLokasi = getIntent.getStringExtra("xLokasi");

        tvDetailJudul.setText(detailJudul);
        tvDetailDeskripsi.setText(detailDeskripsi);
        tvDetailLuas.setText(detailLuas);
        tvDetailKota.setText(detailKota);
        tvDetailTglDibangun.setText(detailTglDibangun);

//        Toast.makeText(DetailActivity.this, "Judul" + detailJudul, Toast.LENGTH_SHORT).show();

        ypvVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.cueVideo(videoId, 0);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + detailJudul + " " + detailKota));
                        startActivity(intent);

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ypvVideo.release();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
