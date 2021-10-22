package br.com.local.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class TelaLogin extends AppCompatActivity {

    private EditText email1;
    private EditText senha1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        email1 = (EditText) findViewById(R.id.email1);
        senha1 = (EditText) findViewById(R.id.senha1);


    }

    public void onClickButtonLogin(View view) {
        String email = email1.getText().toString();
        String senha = senha1.getText().toString();

        Intent intentLogin = new Intent(getApplicationContext(), TelaLogin.class);
        Bundle Parametros = new Bundle();

        Parametros.putString("Chave_email1", email);
        Parametros.putString("Chave_senha1", senha);

        intentLogin.putExtras(Parametros);

        startActivity(intentLogin);

    }
}