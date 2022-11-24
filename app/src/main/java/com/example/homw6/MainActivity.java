package com.example.homw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        Button button = findViewById(R.id.button);










        findViewById(R.id.button).setOnClickListener(view -> {
            if (editText.getText().toString().length() > 0){
                button.setBackgroundColor(getResources().getColor(R.color.orange));
            }
            else {
                button.setBackgroundColor(getResources().getColor(R.color.gray));
            }

            if (editText.getText().toString().equals("admin") && password.getText().toString().
                    equals("admin")){

                findViewById(R.id.email).setVisibility(View.GONE);
                findViewById(R.id.password).setVisibility(View.GONE);
                findViewById(R.id.signin).setVisibility(View.GONE);
                findViewById(R.id.registration).setVisibility(View.GONE);
                findViewById(R.id.button).setVisibility(View.GONE);
                findViewById(R.id.forgot).setVisibility(View.GONE);
                findViewById(R.id.click).setVisibility(View.GONE);
                Toast toast = Toast.makeText(getApplicationContext(),"вы зарегистрировались",
                        Toast.LENGTH_SHORT);
                toast.show();
            }else {
                Toast toast = Toast.makeText(getApplicationContext(), "неверный логин и пароль",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}