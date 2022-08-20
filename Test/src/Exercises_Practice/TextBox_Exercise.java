package Exercises_Practice;

import javax.swing.JOptionPane;

public class TextBox_Exercise 
{
	public static void main (String [] args)
	{
		String Nome = JOptionPane.showInputDialog("Digite seu nome :");
		String Sobrenome = JOptionPane.showInputDialog("Digite seu Sobrenome :");
		
		JOptionPane.showMessageDialog(null, "Seu nome eh : " + Nome);
		JOptionPane.showMessageDialog(null, "Seu Sobrenome eh : " + Sobrenome);
	}
}
