package com.hackathon.uzbico.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hackathon.uzbico.R;
import com.hackathon.uzbico.business.CadastroBusiness;

/**
 * Activity da tela de Cadastro de usuarios
 */
public class CadastroActivity extends AppCompatActivity {

    private EditText tcpf;
    private EditText tnome;
    private EditText tsenha;
    private EditText temail;
    private EditText tfone;
    private Button bsalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        tcpf = (EditText) findViewById(R.id.tcpf);
        tnome = (EditText) findViewById(R.id.tnome);
        tsenha = (EditText) findViewById(R.id.tsenha);
        temail = (EditText) findViewById(R.id.temail);
        tfone = (EditText) findViewById(R.id.tfone);
        bsalvar = (Button) findViewById(R.id.bsalvar);

        bsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CadastroBusiness.add(CadastroActivity.this, tcpf.getText().toString(), tnome.getText().toString(),
                        tsenha.getText().toString(), temail.getText().toString(), tfone.getText().toString());

                Toast.makeText(CadastroActivity.this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();

                Intent recyclerIntent = new Intent(getApplicationContext(), ListaHabilidadesActivity.class);
                startActivity(recyclerIntent);

            }
        });
    }
}
