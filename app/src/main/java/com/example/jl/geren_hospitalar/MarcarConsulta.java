package com.example.jl.geren_hospitalar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MarcarConsulta extends AppCompatActivity {

    private Spinner spinnerHosp = null;
    private Spinner spinnerCli = null;
    private Spinner spinnerMed = null;
    private Spinner spinnerData = null;
    private Spinner spinnerHora = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcar_consulta);

        spinnerHosp = (Spinner) findViewById(R.id.spinnerHosp);
        spinnerCli = (Spinner) findViewById(R.id.spinnerCli);
        spinnerMed = (Spinner) findViewById(R.id.spinnerMed);
        spinnerData = (Spinner) findViewById(R.id.spinnerData);
        spinnerHora = (Spinner) findViewById(R.id.spinnerHora);


        ArrayAdapter<CharSequence> adapter_hosp = ArrayAdapter.createFromResource(this, R.array.app_hospital,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_cli = ArrayAdapter.createFromResource(this, R.array.app_cliente,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_med = ArrayAdapter.createFromResource(this, R.array.app_medico,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_data = ArrayAdapter.createFromResource(this, R.array.app_dataa,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_hora = ArrayAdapter.createFromResource(this, R.array.app_horaa,
                android.R.layout.simple_spinner_item);

        adapter_hosp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_cli.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_med.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_hora.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerHosp.setAdapter(adapter_hosp);
        spinnerCli.setAdapter(adapter_cli);
        spinnerMed.setAdapter(adapter_med);
        spinnerData.setAdapter(adapter_data);
        spinnerHora.setAdapter(adapter_hora);

        Button enviar = (Button) findViewById(R.id.bntMarcarConsulta);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MarcarConsulta.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
