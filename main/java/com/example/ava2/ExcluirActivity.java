package com.example.ava2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ava2.ConexaoBanco.VeiculoDAO;

import java.util.ArrayList;
import java.util.List;

public class ExcluirActivity extends AppCompatActivity {

    ListView listview;
    TextView vazio;
    private VeiculoDAO dao;
    private List<Veiculo> lista;
    private List<Veiculo> listaFiltrada = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_excluir);

        vazio = (TextView)findViewById(R.id.listaVazia2);
        listview = findViewById(R.id.listViewExcluir);
        dao = new VeiculoDAO(this);
        lista = dao.listar();
        listaFiltrada.addAll(lista);

        if(lista.isEmpty())
            vazio.setVisibility(View.VISIBLE);
        else
            vazio.setVisibility(View.INVISIBLE);;

        ArrayAdapter<Veiculo> adapter = new ArrayAdapter<Veiculo>(this, android.R.layout.simple_list_item_1,lista);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this::onItemClick);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Veiculo veiculo = listaFiltrada.get(position);
        dao.excluir(veiculo);
        Toast.makeText(getApplicationContext(), "Veículo com id ("+veiculo.getId()+") e nome ("+veiculo.getNome()+") exluído com Sucesso !", Toast.LENGTH_LONG).show();
        finish();
    }
}