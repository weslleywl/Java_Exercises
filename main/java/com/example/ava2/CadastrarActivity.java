package com.example.ava2;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ava2.ConexaoBanco.VeiculoDAO;

public class CadastrarActivity extends AppCompatActivity {

    Button btn;
    EditText nome,cor,preco,velocidadeMaxima;
    RadioButton combustao,eletrico;

    private Veiculo veiculo = null;
    private VeiculoDAO dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastrar);

        nome = (EditText)findViewById(R.id.campo1);
        cor = (EditText)findViewById(R.id.campo2);
        preco = (EditText)findViewById(R.id.campo3);
        velocidadeMaxima = (EditText)findViewById(R.id.campo4);
        combustao = (RadioButton) findViewById(R.id.combustao);
        eletrico = (RadioButton) findViewById(R.id.eletrico);
        btn = (Button) findViewById(R.id.button);

        dao = new VeiculoDAO(this);
        Intent i = getIntent();
        if (i.hasExtra("veiculoAtualizado"))
        {
            veiculo = (Veiculo) i.getSerializableExtra("veiculoAtualizado");
            nome.setText(veiculo.getNome());
            cor.setText(veiculo.getCor());
            preco.setText(String.valueOf(veiculo.getPreco()));
            velocidadeMaxima.setText(String.valueOf(veiculo.getVelocidadeMaxima()));
            if(!veiculo.isCombustao())
                eletrico.setChecked(true);
            else
                combustao.setChecked(true);
            btn.setText("Atualizar");
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void cadastrar(View view)
    {
        if(veiculo == null)
        {
            veiculo = new Veiculo
            (
                nome.getText().toString(),
                cor.getText().toString(),
                Double.parseDouble(preco.getText().toString()),
                Integer.parseInt(velocidadeMaxima.getText().toString()),
                combustao.isChecked()
            );
            dao.inserir(veiculo);
            Toast.makeText(this,"Veiculo cadastrado com sucesso !",Toast.LENGTH_SHORT).show();
        }
        else
        {
            veiculo.setNome(nome.getText().toString());
            veiculo.setCor(cor.getText().toString());
            veiculo.setPreco(Double.parseDouble(preco.getText().toString()));
            veiculo.setVelocidadeMaxima(Integer.parseInt(velocidadeMaxima.getText().toString()));
            veiculo.setCombustao(combustao.isChecked());
            dao.atualizar(veiculo);
            Toast.makeText(this,"Veiculo atualizado com sucesso !",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,VisualizarActivity.class);
            startActivity(i);
        }
        finish();
    }
}