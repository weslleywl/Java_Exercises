package Exercises_Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExercise 
{
	public static void main (String[]args)
	{
		//com os dados crie um dicionario e os relacione
		Map <String,Integer> estados = new HashMap<>();
		 
		
		estados.put("PE",9616621);
		estados.put("AL",3351543);
		estados.put("CE",9187103);
		estados.put("RN",3534265);
			
		System.out.println(estados.toString());
		System.out.println();
		//Substitua a população do estado do RN por 3.534.165;
		estados.put("RN", 3534165);
		System.out.println("RN agora esta com numeros de habitante diferente : ");
		System.out.println(estados);
		System.out.println();

		//Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
		if (estados.containsKey("PB") == false)
		{
			System.out.println("PB esta no dicionario ? " + estados.containsKey("PB"));
			estados.put("PB",4039277);
			System.out.println("PB adicionado !");
			System.out.println(estados);
		}
		System.out.println();

		//Exiba a população PE;
		System.out.println("A populacao de PE eh de : " + estados.get("PE"));
		System.out.println();
		//Exiba todos os estados e suas populações na ordem que foi informado;
		Map <String,Integer> estados2 = new LinkedHashMap<>();
		
		estados2.put("PE",9616621);
		estados2.put("AL",3351543);
		estados2.put("CE",9187103);
		estados2.put("RN",3534265);
		System.out.println("Ordem de insercao:");
		System.out.println(estados2);
		System.out.println();
		
		//Exiba os estados e suas populações em ordem alfabética;
		
		Map <String, Integer> estados3 = new TreeMap<>();
		
		estados3.put("PE",9616621);
		estados3.put("AL",3351543);
		estados3.put("CE",9187103);
		estados3.put("RN",3534265);
		System.out.println("Ordem alfabetica:");
		System.out.println(estados3);
		System.out.println();

		//Exiba o estado com o menor população e sua quantidade;
		
		//Exiba o estado com a maior população e sua quantidade;
		
		//Exiba a soma da população desses estados;
		Iterator<Integer> I = estados.values().iterator();
		int soma = 0;
		while (I.hasNext())
		{
			double n = I.next();
			soma += n;
		}
		
		System.out.println("A soma da populacao dos estados eh de : "+ soma);
		System.out.println();

		//Exiba a média da população deste dicionário de estados;
		
		System.out.println("A media desta populacao total eh de : "+ soma/estados.size());
		System.out.println();

		//Remova os estados com a população menor que 4.000.000;

		System.out.println("estados =>" + estados);
		Iterator <Integer> i = estados.values().iterator();
		while (i.hasNext())
		{
			int next = i.next();
			if (next < 4000000)
			{
				i.remove();
			}
		}
		System.out.println();
		System.out.println("Atualizado com pop maiores que 4M: "+estados);
		System.out.println();
		//Apague o dicionário de estados;
		System.out.println("Apagando dicionario ...");
		estados.clear();
		System.out.println("Dicionario atualmente : "+ estados);
		System.out.println();
		
		//Confira se o dicionário está vazio.
		
		System.out.println("Conferindo se esta vazio ... "+ estados.isEmpty());
	}
}
