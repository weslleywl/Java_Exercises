package Exercises_Practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExercises1 
{
	public static void main(String[] args)
	{
		//Programa_que_leia_as_temperaturas_médias_dos_6_primeiros_meses_do_ano
		Scanner scan = new Scanner(System.in);
		double[] temperaturas = new double[6];
		for (int i = 0;i < temperaturas.length;i++)
		{
			System.out.println("Digite a temperatura do "+(i+1)+" Mes : ");
			temperaturas[i] = scan.nextInt();
		}
		List <Double> Temp = new ArrayList<Double>();
		Temp.add(temperaturas[0]);
		Temp.add(temperaturas[1]);
		Temp.add(temperaturas[2]);
		Temp.add(temperaturas[3]);
		Temp.add(temperaturas[4]);
		Temp.add(temperaturas[5]);
		int T = 1;
		for (double i : Temp)
		{
			System.out.println("Mes " + T + " Temperatura: " + i);
			T += 1;
		}
		System.out.println();
		//Calcular_a_Média_Semestral_Das_Temperaturas
		
		double media = 0d;
		Iterator <Double> iterator = Temp.iterator();
		while(iterator.hasNext())
		{
			double next = iterator.next();
			media += next;
		}
		media = media / Temp.size();
		System.out.println("A media semestral eh de : " + media);
		System.out.println();
		
		//Mostrar_todas_as_temperaturas_acima_da_media_e_em_que_mes_ocorreram
		int[] Mes = new int[6];
		double[] AcimadaMedia = new double[6];
		int i = 0;
		int a = 0;
		Iterator <Double> iterator2 = Temp.iterator();
		while(iterator2.hasNext())
		{
			double next = iterator2.next();
			if (next > media) 
			{
				AcimadaMedia[i] = next;
				Mes[a] = a + 1;
				System.out.println("O mes "+ Mes[a]+ " estava acima da media com "+AcimadaMedia[i]+" graus");
				i += 1;
			}
			a++;
		}
	}
}