package br.com.local.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class TelaBemvindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_bemvindo);

        Intent intentBemvindo = getIntent();

        Bundle paramentros = intentBemvindo.getExtras();

        if(paramentros != null){

            String email = paramentros.getString("Chave_email1");
            String senha = paramentros.getString("Chave_senha1");

            Toast.makeText(TelaBemvindo.this, "Email" + email + "Senha" + senha, Toast.LENGTH_SHORT).show();
        }

    }
}