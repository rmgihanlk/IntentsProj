package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView result;
    int num_1,num_2;
    Button add,sub,mul,div;

    float res_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number_1=intent.getIntExtra(MainActivity.EXTRA_NUMBER1,0);
        int number_2=intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);

        EditText tv1 = (EditText) findViewById(R.id.num1);
        EditText tv2 = (EditText) findViewById(R.id.num2);

        tv1.setText("" + number_1);
        tv2.setText("" + number_2);

        result =(TextView) findViewById(R.id.result);

        add=(Button) findViewById(R.id.addButton);
        sub=(Button) findViewById(R.id.subButton);
        mul=(Button) findViewById(R.id.mulButton);
        div=(Button) findViewById(R.id.divButton);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                EditText tv1 = (EditText) findViewById(R.id.num1);
                EditText tv2 = (EditText) findViewById(R.id.num2);

                num_1 =Integer.parseInt(tv1.getText().toString());
                num_2 =Integer.parseInt(tv2.getText().toString());
                res_num=num_1+num_2;
                result.setText(String.valueOf(num_1+" + "+num_2+" = " + res_num));
            }
     });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                EditText tv1 = (EditText) findViewById(R.id.num1);
                EditText tv2 = (EditText) findViewById(R.id.num2);

                num_1 =Integer.parseInt(tv1.getText().toString());
                num_2 =Integer.parseInt(tv2.getText().toString());
                res_num=num_1-num_2;
                result.setText(String.valueOf(num_1+" - "+num_2+" = " + res_num));
            }

        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                EditText tv1 = (EditText) findViewById(R.id.num1);
                EditText tv2 = (EditText) findViewById(R.id.num2);

                num_1 =Integer.parseInt(tv1.getText().toString());
                num_2 =Integer.parseInt(tv2.getText().toString());
                res_num=num_1*num_2;
                result.setText(String.valueOf(num_1+" * "+num_2+" = " + res_num));
            }

        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                EditText tv1 = (EditText) findViewById(R.id.num1);
                EditText tv2 = (EditText) findViewById(R.id.num2);

                num_1 =Integer.parseInt(tv1.getText().toString());
                num_2 =Integer.parseInt(tv2.getText().toString());
                res_num=num_1/num_2;
                result.setText(String.valueOf(num_1+" / "+num_2+" = " + res_num));
            }


        });

    }
}