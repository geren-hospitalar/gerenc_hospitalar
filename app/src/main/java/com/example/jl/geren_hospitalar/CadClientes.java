package com.example.jl.geren_hospitalar;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
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


    private void validaCampos(){
        boolean res =  false;

        String nome = txtNome.getText().toString();
        String cpf = txtCpf.getText().toString();
        String endereco = txtEnd.getText().toString();
        String telefone = txtTel.getText().toString();
        String dtnascimento = txtDtNacimento.getText().toString();

        if (res = campoVazio(nome)){
            txtNome.requestFocus();
        }else if(res = campoVazio(cpf)){
            txtCpf.requestFocus();
        }else if(res = campoVazio(endereco)) {
            txtEnd.requestFocus();
        }else if(res = campoVazio(telefone)) {
            txtTel.requestFocus();
        }else if(res = campoVazio(dtnascimento)) {
            txtDtNacimento.requestFocus();
        }


        if(res ){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage("Há campos inválidos ou em branco!");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }

    }

    private boolean campoVazio(String valor){
        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return  resultado;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        switch (id){
            case R.id.bntCadastrarCli:
            validaCampos();
            break;
        }


        return super.onOptionsItemSelected(item);
    }

}
