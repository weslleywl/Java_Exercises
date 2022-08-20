package PolimorphismTest;

public class Program 
{
	public static void main(String[]args)
	{	
		Funcionario caixa = new Caixa();
		caixa.Salario = 3000.0;
		caixa.GetBonificacao();
		System.out.println("Seu sal�rio total � de " + caixa.Salario);
		
		Funcionario gerente = new Gerente();
		gerente.Salario = 5000.0;
		//gerente.GetBonificacao();
		System.out.println("Seu sal�rio total � de " + gerente.Salario);
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.GetBonificacao(gerente);
	}
}
