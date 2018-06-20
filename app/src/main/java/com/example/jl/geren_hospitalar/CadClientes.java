package com.example.jl.geren_hospitalar;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

public class  CadClientes extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtCpf;
    private EditText txtEnd;
    private EditText txtTel;
    private EditText txtDtNacimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_clientes);

        txtNome = (EditText)findViewById(R.id.txtNome);
        txtCpf = (EditText)findViewById(R.id.txtCpf);
        txtEnd = (EditText)findViewById(R.id.txtEnd);
        txtTel = (EditText)findViewById(R.id.txtTel);
        txtDtNacimento = (EditText)findViewById(R.id.txtDtNacimento);

    }


    public void validaCampos(View view){

        String nome = txtNome.getText().toString();
        String cpf = txtCpf.getText().toString();
        String endereco = txtEnd.getText().toString();
        String telefone = txtTel.getText().toString();
        String dtnascimento = txtDtNacimento.getText().toString();

        boolean validar = true;

        if(nome == null || nome.equals("")){
            validar = false;
            txtNome.setError(getString(R.string.val_cadcliente));
        }
        if(cpf == null || cpf.equals("")){
            validar = false;
            txtCpf.setError(getString(R.string.val_cadcliente));
        }

        if(endereco == null || endereco.equals("")){
            validar = false;
            txtEnd.setError(getString(R.string.val_cadcliente));
        }
        if(telefone == null || telefone.equals("")){
            validar = false;
            txtTel.setError(getString(R.string.val_cadcliente));
        }
        if(dtnascimento == null || dtnascimento.equals("")){
            validar = false;
            txtDtNacimento.setError(getString(R.string.val_cadcliente));
        }


    }



}
