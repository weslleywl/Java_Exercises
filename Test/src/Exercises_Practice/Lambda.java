package Exercises_Practice;

public class Lambda 
{
	public static void main(String[] args) 
	{
		//SemLambda !!!
		
//		InterfacedeUmSoMetodo c = new InterfacedeUmSoMetodo() 
//		{ 
//			@Override
//			public void UnicoMetodo() 
//			{
//				System.out.println("Reescrevendo o unico metodo ...");
//			}
//		};
		
		//ComLambda !!!
		
		InterfacedeUmSoMetodo c = () -> System.out.println("Reescrevendo o unico metodo ...");
		c.UnicoMetodo();
		
		/*Lambdas so funcional em functional interfaces*/
	}
}

interface InterfacedeUmSoMetodo
{
	public void UnicoMetodo();
}