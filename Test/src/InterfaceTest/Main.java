package InterfaceTest;

import java.io.IOException;




public class Main 
{
	public static void main (String[]args) throws IOException
	{   
		Carro c = new Carro();
		System.out.println(c.veiculoLiga());
		System.out.println(c.veiculoTemRodas());
		System.out.println(c.veiculoTemMotor());
	}
}
