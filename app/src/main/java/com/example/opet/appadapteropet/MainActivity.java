package com.example.opet.appadapteropet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evento_adapter(View view){

        switch (view.getId()){

            case R.id.btnAdapter1:

                // Chamar a Activity AdapderSimpes
                Intent nova_tela = new Intent(MainActivity.this,AdapterSimplesActivity.class);
                startActivity(nova_tela);
                break;

            case R.id.btnAdapter2:

                // Charmar a Activity CustomAdapter
                Intent tela_nova = new Intent(getApplicationContext(),CustomAdapterActivity.class);
                startActivity(tela_nova);
                //finish(); fecha a tela anterior
                break;
        }
    }
}
