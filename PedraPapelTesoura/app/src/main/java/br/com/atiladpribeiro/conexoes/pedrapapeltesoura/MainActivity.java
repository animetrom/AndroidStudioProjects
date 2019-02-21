package br.com.atiladpribeiro.conexoes.pedrapapeltesoura;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario){
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        String[] opcoes = {"pedra", "papel", "tesoura"};

        // GERAR NÚMERO ALEATÓRIO PARA ESCOLHA DO APP
        int numero = new Random().nextInt(3);

        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "pedra" :
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel" :
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura" :
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if(
                (escolhaApp=="pedra" && escolhaUsuario=="tesoura") ||
                  (escolhaApp=="papel" && escolhaUsuario=="pedra") ||
                    (escolhaApp=="tesoura" && escolhaUsuario=="papel")
                ){ // APP GANHADOR
            textResultado.setText("Você perdeu :(");

        } else if (

                (escolhaUsuario=="pedra" && escolhaApp=="tesoura") ||
                   (escolhaUsuario=="papel" && escolhaApp=="pedra") ||
                     (escolhaUsuario=="tesoura" && escolhaApp=="papel")
                ){ // USUÁRIO GANHADOR
            textResultado.setText("Você ganhou :)");
        }else { // EMPATE
            textResultado.setText("Empatamos...");
        }

    }



}
