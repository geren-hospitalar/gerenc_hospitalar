package com.example.jl.geren_hospitalar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListarHospitais extends AppCompatActivity {



    public void atualhospitais(View view){

        Intent intent = new Intent(getApplicationContext(), AtualizarHospitais.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_hospitais);
    }
}
