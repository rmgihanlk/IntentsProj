package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER1 = "com.example.intentsproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.intentsproj.EXTRA_NUMBER2";


    public Button button;

    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText  editText1=(EditText) findViewById(R.id.n1);

                int number_1 = Integer.parseInt(editText1.getText().toString());
                EditText editText2=(EditText) findViewById(R.id.n2);
                int number_2 =Integer.parseInt(editText2.getText().toString());

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_NUMBER1, number_1);
                intent.putExtra(EXTRA_NUMBER2, number_2);

                startActivity(intent);
                Toast.makeText(MainActivity.this,"Sending Data",Toast.LENGTH_SHORT).show();

                LayoutInflater inflater=getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.idTost));

                Toast toast=new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0 ,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
            }


        });
    }

}