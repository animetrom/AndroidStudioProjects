package br.com.atiladpribeiro.carnaval.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calcula extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcula);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View v) {
        // RECUPERANDO OS VALORES DIGITADOS
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();


        // VALIDANDO A VALIDAÇÃO DOS CAMPOS
        Boolean camposValidados = this.validarCampos(precoAlcool, precoGasolina);

        if (camposValidados) {
            this.calcularMelhorPreco(precoAlcool, precoGasolina);
        } else {
            textResultado.setText("Por favor, informe os valores.");
        }
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina) {
        // CONVERTENDO VALORES STRING PARA NÚMEROS
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);

        /* FAZEMOS O CÁLCULO (precoAlcool / precoGasolina)
         * SE O RESULTADO FOR >= 0.7 MELHOR UTILIZAR GASOLINA
         * SENÃO MELHOR ÁLCOOL */

        Double resultado = precoAlcool / precoGasolina;

        if (resultado >= 0.7) {
            textResultado.setText("Melhor utilizar GASOLINA!");
        } else {
            textResultado.setText("Melhor utilizar ÁLCOOL!");
        }

    }

    public Boolean validarCampos(String pAlcool, String pGasolina) {
        // AQUI JÁ INICIAMOS A VARIÁVEL DO TIPO BOOLEANA COM VALORES DE TRUE
        Boolean camposValidados = true;

        // VALIDANDO OS CAMPOS
        if (pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;
        } else if (pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;
        }
        return camposValidados;
    }

}
