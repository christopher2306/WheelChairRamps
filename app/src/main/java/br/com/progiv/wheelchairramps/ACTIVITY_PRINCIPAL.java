package br.com.progiv.wheelchairramps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ACTIVITY_PRINCIPAL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void proximaTela(View view){

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


}