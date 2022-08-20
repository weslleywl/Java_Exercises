package PackagePrivatetest;

import InterfaceTest.*;

/**
 * 
 * @author WeslleySantos
 * 
 * This class is basically a test of the visibility "PackagePrivate"
 * */
public class Main 
{
	public static void main(String[] args) 
	{
		Carro c = new Carro();
		System.out.println(c.veiculoLiga());
		System.out.println(c.veiculoTemRodas());
		System.out.println(c.veiculoTemMotor());
	}
}
