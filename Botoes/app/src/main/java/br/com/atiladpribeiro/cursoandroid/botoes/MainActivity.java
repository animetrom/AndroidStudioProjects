/* INDICA O PACKAGE DO QUAL O NOSSO ARQUIVO FAZ PARTE */
package br.com.atiladpribeiro.cursoandroid.botoes;

/* TODAS AS BIBLIOTECAS QUE O NOSSO APP VAI UTILIZAR */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/* CLASSE PÚBLICA MAIN ACTIVITY */
public class MainActivity extends AppCompatActivity {

    /*  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void alteraTexto(View view){
        TextView texto = findViewById(R.id.textoExibido);
        texto.setText("Átila Ribeiro");
}
}
