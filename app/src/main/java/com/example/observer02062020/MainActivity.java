package com.example.observer02062020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.OnLifecycleEvent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = new Button(this);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        inso(new OnListenValue() {
            @Override
            public boolean isResultCondition(int value) {
                return value % 2 == 0;
            }
        });
    }

    // Chạy vòng lặp 1 - 100
    // function inSoChan
    // function inSoLe
    // function inSoChia3Du1
    // function inSoChinhPhuong (Căn của giá trị và phải là số nguyên)

    private void inSoChan(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void inSoLe(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void inSoChia3Du1(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void inso(OnListenValue resultCondiTion){
        for (int i = 1; i <= 100; i++) {
            boolean dk = resultCondiTion.isResultCondition(i);
            if (dk) {
                Log.d("BBB",i + "");
            }
        }
    }

    private void inSoChinhPhuong(){
        for (int i = 1; i <= 100; i++) {
            if (Math.sqrt(i) % 1 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
}