package Exercises_Practice;

public class ClasseAnonima 
{
	public static void main(String[] args) 
	{
		ClasseAparente ClasseAparente = new ClasseAparente();
		ClasseAparente ClasseAnonima = new ClasseAparente() 
		{
		 @Override
		 public void MetodoAparente() 
		 {
			 System.out.println("Testando escrita do metodo aparente mas da classe anonima !");
		 }
		};

		System.out.println("Metodo aparente vindo ...");
		ClasseAparente.MetodoAparente();
		System.out.println();
		System.out.println("Metodo anonimo vindo ...");
		ClasseAnonima.MetodoAparente();		
	}

}

class ClasseAparente
{
	public void MetodoAparente()
	{
		System.out.println("Testando escrita do metodo aparente !");
	}
}