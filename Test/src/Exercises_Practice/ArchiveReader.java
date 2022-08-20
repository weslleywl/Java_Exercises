package Exercises_Practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArchiveReader 
{

	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new FileReader("c:/Carro.txt"));

		while(br.ready()){
		String linha = br.readLine();
		System.out.println(linha);
		}
		br.close();
	}

}
