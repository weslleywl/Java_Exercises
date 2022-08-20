package Main;

public class Gerente extends Funcionario
{
	@Override
	public double GetBonificacao()
	{
		double bonificacao = 200;
		return super.Salario + bonificacao; 
	}
	public void CadastrarFuncionario(String nome,String departamento,String cpf,String rg,double salario)//Remaining !!!
	{
		super.Nome = nome;
		super.Departamento = departamento;
		super.CPF = cpf;
		super.RG = rg;
		super.Salario = salario;
	}
	public String ConsultarFuncionario(String argumentodebusca)
	{
		if (argumentodebusca == super.Nome) 
		{
			return "Funcionario: " + super.Nome + " Departamento: " + super.Departamento + " CPF: " + super.CPF + " RG: " + super.RG + " Salario: " + super.Salario;
		}
		else if (argumentodebusca == super.Departamento) 
		{
			return "Funcionario: " + super.Nome + " Departamento: " + super.Departamento + " CPF: " + super.CPF + " RG: " + super.RG + " Salario: " + super.Salario;
		}
		else if (argumentodebusca == super.CPF) 
		{
			return "Funcionario: " + super.Nome + " Departamento: " + super.Departamento + " CPF: " + super.CPF + " RG: " + super.RG + " Salario: " + super.Salario;
		}
		else if (argumentodebusca == super.RG) 
		{
			return "Funcionario: " + super.Nome + " Departamento: " + super.Departamento + " CPF: " + super.CPF + " RG: " + super.RG + " Salario: " + super.Salario;
		}
		else 
		{
			return "Nenhum funcionario encontrado !";
		}
	}
	public void DeletarFuncionario(String cpf) 
	{
		if (cpf == super.CPF) 
		{
			super.Nome = "";
			super.Departamento = "";
			super.CPF = "";
			super.RG = "";
			super.Salario = 0;
		}
		else
		{
			System.out.println("Funcionario nao existe !");
		}
	}
	public void CadastrarProduto()//Remaining!
	{}
	public void DeletarProduto()//Remaining!
	{}
}
