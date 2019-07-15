package com.phong.hocvariableaslistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnAn, btnHien;
    ImageView imgHinh;
    View.OnClickListener myEvents = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btnAnHinh)
            {
                //Ẩn hình ảnh
                imgHinh.setVisibility(View.INVISIBLE);
            }
            else if (view.getId()==R.id.btnHienThi)
            {
                //Hiền thị hình ảnh
                imgHinh.setVisibility(View.VISIBLE);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnAn.setOnClickListener(myEvents);
        btnHien.setOnClickListener(myEvents);
    }

    private void addControls() {
        btnAn = (Button) findViewById(R.id.btnAnHinh);
        btnHien = (Button) findViewById(R.id.btnHienThi);
        imgHinh = (ImageView) findViewById(R.id.imgHinh);
    }
}
