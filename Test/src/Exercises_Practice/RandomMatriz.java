package Exercises_Practice;

import java.util.Random;

import javax.annotation.processing.RoundEnvironment;

public class RandomMatriz 
{
	public static void main(String[] args) 
	{
		//randomizer
		Random rand = new Random();
		int[][] Matriz = new int[3][3];
		
		for (int l = 0; l < Matriz.length; l++)
		{	
			for (int c = 0; c < Matriz.length; c++) 
			{
				Matriz[l][c] = rand.nextInt(100);
			}
		}
		//JavaForeach
		for (int[] a : Matriz)
		{
			for (int b : a)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
