package br.com.atiladpribeiro.carnaval.caraoucoroaanim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class TelaJogar extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogar);

        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TelaResultado.class);


                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);

                startActivity(intent);
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);

            }
        });


    }



}
