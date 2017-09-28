package com.example.conversor;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    EditText euros;
    EditText dolares;
    RadioButton EurosADolares;
    RadioButton DolaresAEuros;
    Button convertir;
    Conversion miConversor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        euros = (EditText) findViewById(R.id.editTextEuros);
        dolares = (EditText) findViewById(R.id.editTextDolares);
        EurosADolares = (RadioButton) findViewById(R.id.radioButton1);
        DolaresAEuros = (RadioButton) findViewById(R.id.radioButton2);
        convertir = (Button) findViewById(R.id.button);
        convertir.setOnClickListener(this);

        miConversor = new Conversion();
    }

    @Override
    public void onClick(View view) {
        if (view == convertir) {
            if (EurosADolares.isChecked())
                try {
                    dolares.setText(miConversor.convertirADolares(euros.getText().toString()));
                } catch (Exception e) {
                    Toast.makeText(this, "Error al introducir €", Toast.LENGTH_SHORT).show();
                }
            else
                try {
                    euros.setText(miConversor.convertirAEuros(dolares.getText().toString()));
                } catch (Exception ex) {
                    Snackbar.make(view, "Error al introducir $", Snackbar.LENGTH_SHORT).show();
                }
        }
    }

}
