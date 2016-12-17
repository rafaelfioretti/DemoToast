package br.com.rafaelfioretti.demotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.rafaelfioretti.toastlibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToast ct = new CustomToast();
        ct.exibirMensagem(this, "teste");
    }
}
