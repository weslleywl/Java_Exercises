package PolimorphismTest;

public class Caixa extends Funcionario 
{
	public double GetBonificacao()
	{
		double boni = super.GetBonificacao() + 100;
		System.out.println("Recebendo bonificacao de Caixa, seu acréscimo foi de R$ " + boni);
		return Salario += boni;
	}
}
