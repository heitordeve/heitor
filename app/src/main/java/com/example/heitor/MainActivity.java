package com.example.heitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail, edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);

        Login();
    }

    private void Login() {

        String email = edtEmail.getText().toString();
        String senha = edtSenha.getText().toString();



        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.equals("") && senha.equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Usuário ou senha vázios, favor preencher", Toast.LENGTH_LONG );
                    toast.show();
                }

                if(email.equals("h@h.com") && senha.equals("12345678")){
                    Intent i = new Intent(MainActivity.this, SegundaTelaActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos! Favor preencher novamente", Toast.LENGTH_LONG ).show();
                    edtEmail.setText("");
                    edtSenha.setText("");
                    edtEmail.requestFocus();
                }

            }
        });

    }
}