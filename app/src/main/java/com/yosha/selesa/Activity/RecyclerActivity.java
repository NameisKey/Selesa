package com.yosha.selesa.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yosha.selesa.Adapter.AdapterData;
import com.yosha.selesa.Data.DataKemerdekaanIndonesia;
import com.yosha.selesa.Model.ModelTempatBersejarah;
import com.yosha.selesa.R;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView rvTempatBersejarah;
    private ArrayList<ModelTempatBersejarah> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rvTempatBersejarah = findViewById(R.id.rv_tempatsejarah);
        rvTempatBersejarah.setHasFixedSize(true);

        data.addAll(DataKemerdekaanIndonesia.ambilData());
        tampilData();
    }

    private void tampilData(){
        rvTempatBersejarah.setLayoutManager(new LinearLayoutManager(this));
        AdapterData AD = new AdapterData(data, RecyclerActivity.this);
        rvTempatBersejarah.setAdapter(AD);
    }
}