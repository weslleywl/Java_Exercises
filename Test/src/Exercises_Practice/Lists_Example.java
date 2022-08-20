package Exercises_Practice;

import java.util.ArrayList;
import java.util.List;

public class Lists_Example 
{
	public static void main(String[] args) 
	{
		List <Animais> Bichos = new ArrayList<Animais>();
		Bichos.add(new Animais("Cachorro","Spike"));
		Bichos.add(new Animais("Gato","Boris"));
		
		System.out.println(Bichos);
	}

}

class Animais
{
	 String Tipo,Nome;
	 
	 public Animais (String T,String N)
	 {
		 this.Tipo = T;
		 this.Nome = N;
	 }
	 @Override
	 public String toString()
	 {
		 return this.Tipo + " " + this.Nome;
	 }
}
