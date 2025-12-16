package com.example.ava2.ConexaoBanco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.ava2.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO
{
    private Conexao conexao;
    private SQLiteDatabase banco;

    public VeiculoDAO(Context context)
    {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public void inserir(Veiculo v)
    {
        ContentValues valores = new ContentValues();
        valores.put("Nome",v.getNome());
        valores.put("Cor",v.getCor());
        valores.put("Preco",v.getPreco());
        valores.put("VelocidadeMaxima",v.getVelocidadeMaxima());
        if(v.isCombustao())
        {
            valores.put("Combustao",1);
        }
        else
        {
            valores.put("Combustao",0);
        }
        banco.insert("Veiculo",null,valores);
        banco.close();
    }
    public List<Veiculo> listar()
    {
        List<Veiculo> lista = new ArrayList<>();
        Cursor cursor = banco.query("Veiculo",new String[]{"Id","Nome","Cor","Preco","VelocidadeMaxima","Combustao"},null,null,null,null,null);
        while(cursor.moveToNext())
        {
            boolean ehCombustao;
            if(cursor.getInt(5)==0)
            {
                ehCombustao = false;
            }
            else
            {
                ehCombustao = true;
            }
            Veiculo veiculo = new Veiculo(cursor.getString(1),cursor.getString(2),cursor.getDouble(3),cursor.getInt(4),ehCombustao);
            veiculo.setId(cursor.getLong(0));
            lista.add(veiculo);
        }
        return lista;
    }
    public void excluir(Veiculo v)
    {
        banco.delete("Veiculo","Id = ?",new String[]{String.valueOf(v.getId())});
    }

    public void atualizar(Veiculo v)
    {
        ContentValues valores = new ContentValues();
        valores.put("Nome",v.getNome());
        valores.put("Cor",v.getCor());
        valores.put("Preco",v.getPreco());
        valores.put("VelocidadeMaxima",v.getVelocidadeMaxima());
        boolean ehCombustao = v.isCombustao();
        if(ehCombustao)
        {
            valores.put("Combustao",1);
        }
        else
        {
            valores.put("Combustao",0);
        }
        banco.update("Veiculo",valores,"Id = ?",new String[]{String.valueOf(v.getId())});
    }
}
