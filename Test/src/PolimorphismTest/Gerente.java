package PolimorphismTest;

public class Gerente extends Funcionario 
{
	public double GetBonificacao()
	{
		double boni = super.GetBonificacao() + 250;
		System.out.println("Recebendo bonificação de gerente, seu acréscimo foi de R$ "+boni);
		return Salario += boni;
	}
}
