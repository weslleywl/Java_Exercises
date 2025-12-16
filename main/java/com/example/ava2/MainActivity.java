package com.example.ava2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void cadastrarNovo(View V)
    {
        Intent proximaTela = new Intent(this,CadastrarActivity.class);
        startActivity(proximaTela);
    }
    public void visualizarCadastrados(View V)
    {
        Intent proximaTela = new Intent(this,VisualizarActivity.class);
        startActivity(proximaTela);
    }
    public void excluirCadastrados(View V)
    {
        Intent proximaTela = new Intent(this,ExcluirActivity.class);
        startActivity(proximaTela);
    }
}