package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button button,button5;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //button2的单击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                for (int i=0; i < radioGroup.getChildCount(); i++ ){
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                    if(radioButton.isChecked()){
                        str = radioButton.getText().toString();
                        break;
                    }
                }
                //button的输出内容
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
            }
        });

        //button5的单击事件
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                //定义checkbox的数组
                CheckBox[]checkBoxes = new CheckBox[]{checkBox1, checkBox2, checkBox3,checkBox4};
                for (int i=0; i<checkBoxes.length; i++){
                    if (checkBoxes[i].isChecked()){
                        str+= checkBoxes[i].getText().toString() +";";
                    }
                }
                //button5的提示语句输出
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
                //语句清空
                str = "";
            }
        });
    }
    private void initView(){
        radioGroup = findViewById(R.id.group);
        button = findViewById(R.id.button2);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        button5 = findViewById(R.id.button5);

    }
}