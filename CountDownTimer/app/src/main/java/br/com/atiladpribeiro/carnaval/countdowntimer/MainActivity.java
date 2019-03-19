package br.com.atiladpribeiro.carnaval.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(3000, 1000) {

            public void onTick(l0ong millisUntilFinished) {

            }

            public void onFinish() {

            }

        }.start();

    }
}
