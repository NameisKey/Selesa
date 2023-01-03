package com.yosha.selesa.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yosha.selesa.R;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton openBottomModal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openBottomModal = findViewById(R.id.btn_fab);
        openBottomModal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomDialog = new BottomSheetDialog(MainActivity.this, com.google.android.material.R.style.Theme_Design_BottomSheetDialog);
                View bottomView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.modal_info, (RelativeLayout)findViewById(R.id.modalBottomContainer));

                bottomDialog.setContentView(bottomView);
                bottomDialog.show();
            }
        });


    }
}
