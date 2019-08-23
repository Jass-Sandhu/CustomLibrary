package com.example.customlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.samplelibrary.CentralTendency;

public class MainActivity extends AppCompatActivity {

    EditText et_num1,et_num2;
    Button btn_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num1=findViewById(R.id.et_num1);
        et_num2=findViewById(R.id.et_num2);
        btn_sum=findViewById(R.id.btn_sum);



        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Number sum=0;
                if (!et_num1.getText().toString().equalsIgnoreCase("") || !et_num2.getText().toString().equalsIgnoreCase(""))
                {
                    sum=CentralTendency.calculateSum(Integer.parseInt(et_num1.getText().toString()),Integer.parseInt(et_num2.getText().toString()));

                }

                final Number finalSum = sum;

                Toast.makeText(MainActivity.this, finalSum.toString(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
