package test;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
//		double age,bornYear,CurrentYear;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o ano em que nasceu :");
//		bornYear = sc.nextDouble();
//		System.out.println("Digite o ano em que estamos :");
//		CurrentYear = sc.nextDouble();
//		age = CurrentYear - bornYear;
//		System.out.println("A sua idade é de :" + age);
		
//		Enum M = Enum.Manha;
//		Enum T = Enum.Tarde;
//		Enum n = Enum.Noite;
//		
//		System.out.println(M.valor);
//		System.out.println(M.ordinal() + 1 + "º Turno");
//
//		System.out.println(T.valor);
//		System.out.println(T.ordinal() + 1 + "º Turno");
//
//		System.out.println(n.valor);
//		System.out.println(n.ordinal() + 1 + "º Turno");
		
			Scanner sc = new Scanner(System.in);
			String Resposta = "sim";
			int Numero,totalPares = 0,totalImpares = 0;
			System.out.println("inicio");
			Resposta = sc.next("");
			while(Resposta == "sim")
			{			
				System.out.println("Digite seu numero : ");
				Numero = sc.nextInt();
				if(Numero%2 == 0)
				{
					System.out.println("Seu numero eh Par...\n");
					totalPares ++;
					System.out.println(totalPares);
					System.out.println(Resposta);
				}
				else 
				{
					System.out.println("Seu numero eh Impar...\n");
					totalImpares ++;
					System.out.println(totalImpares);
					System.out.println(Resposta);
				}	
				System.out.println("Deseja digitar outro numero ? S / N ");
				sc.next(Resposta);
			}
			System.out.println("Voce digitou um total de numeros Pares" + totalPares);
			System.out.println("Voce digitou um total de snumeros Impares" + totalImpares);


	}
}
