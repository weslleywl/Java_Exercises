package PolimorphismTest;

public class Gerente extends Funcionario 
{
	public double GetBonificacao()
	{
		double boni = super.GetBonificacao() + 250;
		System.out.println("Recebendo bonifica��o de gerente, seu acr�scimo foi de R$ "+boni);
		return Salario += boni;
	}
}
