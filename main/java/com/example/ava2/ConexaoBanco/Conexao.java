package com.example.ava2.ConexaoBanco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper
{

    private static final String database = "VeiculoBD";
    private static final int version = 1;

    public Conexao(Context context)
    {
        super(context,database,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE Veiculo(Id integer primary key autoincrement,Nome varchar(50),Cor varchar(50),Preco numeric, VelocidadeMaxima integer, Combustao integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
