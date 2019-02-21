package br.com.atiladpribeiro.atividade1302.atividade1302;

// IMPORTANDO BIBLIOTECAS
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

    // VARIÁVEL USADA PARA GERAR NÚMEROS DE 0 A 20
    public void sorteiaNumero20(View view){
        TextView textoResultado20 = findViewById(R.id.textoResultado20);

        int x = new Random().nextInt(21);

        textoResultado20.setText("O número sorteado foi: " + x);
    }

    // VARIÁVEL USADA PARA GERAR NÚMEROS DE 0 A 100
    public void sorteiaNumero100(View view){
        TextView textoResultado100 = findViewById(R.id.textoResultado100);

        int y = new Random().nextInt(101);

        textoResultado100.setText("O número sorteado foi: " + y);
    }

    // VARIÁVEL USADA PARA GERAR NÚMEROS DE 0 A 1000
    public void sorteiaNumero1000(View view){
        TextView textoResultado1000 = findViewById(R.id.textoResultado1000);

        int z = new Random().nextInt(1001);

        textoResultado1000.setText("O número sorteado foi: " + z);

    }

}
