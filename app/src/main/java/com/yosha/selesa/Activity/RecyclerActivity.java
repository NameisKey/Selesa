package com.yosha.selesa.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.yosha.selesa.Adapter.AdapterData;
import com.yosha.selesa.Data.DataHindu;
import com.yosha.selesa.Data.DataIslam;
import com.yosha.selesa.Data.DataKemerdekaanIndonesia;
import com.yosha.selesa.Model.ModelTempatBersejarah;
import com.yosha.selesa.R;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView rvTempatBersejarah;
    private String state, judul;
    private TextView tvJudul;
    private ArrayList<ModelTempatBersejarah> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        tvJudul = findViewById(R.id.judul);
        Intent getIntent = getIntent();

        judul = getIntent.getStringExtra("xJudul");
        state = getIntent.getStringExtra("xState");

        tvJudul.setText(judul);

        rvTempatBersejarah = findViewById(R.id.rv_tempatsejarah);
        rvTempatBersejarah.setHasFixedSize(true);
//        Toast.makeText(RecyclerActivity.this, "State : " + state, Toast.LENGTH_SHORT).show();

        switch (state){
            case "stateKemerdekaan":
                data.addAll(DataKemerdekaanIndonesia.ambilData());
                break;
            case "stateIslam":
                data.addAll(DataIslam.ambilData());
                break;
            case "stateHindu":
                data.addAll(DataHindu.ambilData());
        }
        tampilData();
    }

    private void tampilData(){
        rvTempatBersejarah.setLayoutManager(new LinearLayoutManager(this));
        AdapterData AD = new AdapterData(data, RecyclerActivity.this);
        rvTempatBersejarah.setAdapter(AD);
    }
}