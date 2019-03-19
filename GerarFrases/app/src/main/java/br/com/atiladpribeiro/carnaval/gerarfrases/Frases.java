package br.com.atiladpribeiro.carnaval.gerarfrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Frases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "Vida longa e próspera(Spock)",
                "Meu precioso(Smeagol)",
                "Tchau Lucas, até segunda...",
                "Eu tenho a força(He-Man)",
                "Que a força esteja com você!(Star Wars)",
                "Avante Vingadores(Capitão América)"
        };

        int numero = new Random().nextInt(frases.length);
        TextView textoGerado = findViewById(R.id.txtFrase);
        textoGerado.setText(frases[numero]);

    }

}
