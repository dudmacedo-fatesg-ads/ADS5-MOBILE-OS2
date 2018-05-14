package br.com.senaigo.mobile.os2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.senaigo.mobile.os2.R;
import br.com.senaigo.mobile.os2.model.LoginModel;

public class LoginActivity extends AppCompatActivity {

    private EditText user, senha;
    private CardView btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializarComponentes();

        TextView txtEsqueciSenha = (TextView) findViewById(R.id.txtEsqueciSenha);


    }

    private void inicializarComponentes() {
        user = findViewById(R.id.txtUser);
        senha = findViewById(R.id.txtSenha);
        btnEntrar = findViewById(R.id.cardEntrar);
    }


    //Metodo
    public void lembrarSenha(View view){

        Intent intent = new Intent(LoginActivity.this, EsqueciSenhaActivity.class);
        startActivity(intent);
    }


    //Metodo
    public void login(View view){

        LoginModel loginobj = new LoginModel(user.getText().toString(),senha.getText().toString());


        if(loginobj.getSenha().equals("") || loginobj.getUser().equals("")){
            Toast.makeText(LoginActivity.this, "Usuario ou senha nao informado!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(LoginActivity.this, "Usuario Logado!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, ListaOSActivity.class);
            startActivity(intent);
        }

    }

}