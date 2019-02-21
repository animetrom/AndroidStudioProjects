package br.com.atiladpribeiro.atividade1302.atividade1302b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maca (View view){
        TextView maca = findViewById(R.id.textoExibido);
        maca.setText("Maçã");
    }

    public void laranja (View view) {
        TextView laranja = findViewById(R.id.textoExibido);
        laranja.setText("Laranja");
    }

    public void banana (View view) {
        TextView banana = findViewById(R.id.textoExibido);
        banana.setText("Banana");
    }

    public void uva (View view) {
        TextView uva = findViewById(R.id.textoExibido);
        uva.setText("Uva");
    }

}
