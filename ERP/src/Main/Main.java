package Main;

public class Main 
{
	public static void main(String[]args)
	{
		System.out.println("Corpo principal da aplicacao sera aqui");
		
		Funcionario g = new Gerente();
		((Gerente) g ).CadastrarFuncionario("Joao", "financias", "1231213", "65456464", 1200);
		System.out.println("Meu nome eh " + g.Nome + " departamento de  :" + g.Departamento);
		
		throw new ArithmeticException("Deu ruim aqui em uma conte que nem existe");
	}
}
