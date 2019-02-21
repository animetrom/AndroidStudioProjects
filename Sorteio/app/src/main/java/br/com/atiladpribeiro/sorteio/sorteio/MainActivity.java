package br.com.atiladpribeiro.sorteio.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 public void sorteiarNumero(View view){
        TextView textoResultado = findViewById(R.id.textoResultado);

        int x = new Random().nextInt(11);
        textoResultado.setText("O número sorteado foi: " + x);
  }
 }
