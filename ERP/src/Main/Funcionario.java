package Main;

public abstract class Funcionario 
{
	protected String Nome, Departamento, CPF, RG;
	protected double Salario;
	
	public void Trabalhar()
	{
		System.out.println("Estou trabalhando ...");
	}
	public void ReceberSalario(double Pagamento)
	{
		this.Salario = Pagamento;
	}
	public void ConsultarProduto() //Remaining !!!
	{}
	public double GetBonificacao()
	{
		double bonificacao = 100;
		return this.Salario + bonificacao;
	}
}
