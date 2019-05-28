package com.example.aluno.reservaambientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_Login extends AppCompatActivity {

    private Button bLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__login);

        bLogin = findViewById(R.id.buttonLogar);


        bLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent it = new Intent(MainActivity_Login.this, MainActivity_Usuario.class);
                startActivity(it);
            }
        });
    }
}
