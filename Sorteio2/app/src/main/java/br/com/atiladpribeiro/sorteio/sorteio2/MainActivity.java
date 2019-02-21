package br.com.atiladpribeiro.sorteio.sorteio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sorteiaNumero(View view) {
        TextView textoResultado = findViewById(R.id.textoResultado);

        int x = new Random().nextInt(11);
        textoResultado.setText("O número sorteado foi: " + x);
    }

}
