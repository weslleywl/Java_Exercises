package Exercises_Practice;
import java.util.Scanner;
public class ConsonantReader 
{
	public static void main(String[] args) 
	{
		//Basically you have to create a program that reads 5 letters and tell which one is a consonant
		Scanner scan = new Scanner(System.in); 
		String[] Letters = new String[5];
		
		for (int i = 0; i < Letters.length; i++) 
		{
			System.out.println("Digite a sua " + (i+1) + "o Letra : ");
			Letters[i] = scan.next();
		}
		
		System.out.println("As consoantes digitadas foram : ");
		for (String letter : Letters)
		{
			if (!(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u"))) 
			{
				System.out.print(letter + " ");
			}
		}
	}

}
