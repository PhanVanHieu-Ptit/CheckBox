package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbAndroid,cbIOS,cbPHP;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc="Ban Da Chon Mon Hoc:\n";
                if(cbAndroid.isChecked()){
                    monhoc +=cbAndroid.getText()+"\n";
                }
                if(cbIOS.isChecked()){
                    monhoc+=cbIOS.getText()+"\n";
                }
                if(cbPHP.isChecked()){
                    monhoc+=cbPHP.getText()+"\n";
                }
                
                Toast.makeText(MainActivity.this, monhoc, Toast.LENGTH_SHORT).show();
            }
        });

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Ban Da Chon Android", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Ban Da Bo Chon Android", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbIOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Ban Da Chon IOS", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Ban Da Bo Chon IOS", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbPHP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Ban Da Chon PHP", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Ban Da Bo Chon PHP", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void AnhXa(){
        cbAndroid = (CheckBox) findViewById(R.id.checkBox);
        cbIOS = (CheckBox) findViewById(R.id.checkBox2);
        cbPHP = (CheckBox) findViewById(R.id.checkBox3);
        btnXacNhan = (Button) findViewById(R.id.butonxacnhan);
    }
}