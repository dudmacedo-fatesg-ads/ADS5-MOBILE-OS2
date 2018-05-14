package br.com.senaigo.mobile.os2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.senaigo.mobile.os2.R;
import br.com.senaigo.mobile.os2.model.EsqueciSenhaModel;

public class EsqueciSenhaActivity extends AppCompatActivity {

    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);
        inicializarComponentes();

    }

    private void inicializarComponentes() {
        email = findViewById(R.id.txtEmail);
    }

    //Metodo
    public void recuperarSenha(View view){

        EsqueciSenhaModel obj = new EsqueciSenhaModel(email.getText().toString());

        if(obj.getEmail().equals("")){

        }else{

            Toast.makeText(EsqueciSenhaActivity.this, "voce recebeu um email com suas credenciais!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(EsqueciSenhaActivity.this, LoginActivity.class);
            startActivity(intent);
        }


    }
}