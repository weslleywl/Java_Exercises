package PolimorphismTest;

public class Funcionario 
{
	String Nome,CPF,DataNascimento;
	double Salario;
	
	public double GetBonificacao()
	{
		return this.Salario * 0.05;
	}
}
