package test;

public abstract class Veiculo 
{
	public boolean Rodas = false;
	public boolean Portas = false;
	public boolean Automático = false;
	public boolean Liga = false;
	
	public boolean RodasCheckup() 
	{
		if (Rodas == true) 
		{
			System.out.println("O veiculo possui rodas");
			return true;
		}
		else 
		{
			System.out.println("O veiculo não possui rodas !");
			return false;
		}
	}
	public String PortasCheckup() 
	{
		if (Portas == true) 
		{
			return "O veiculo possui portas";
		}
		else 
		{
			return "O veiculo não possui portas !";
		}
	}
	public String AutomaticoCheckup() 
	{
		if (Automático == true) 
		{
			return "O veiculo é sim automático";
		}
		else 
		{
			return "O veiculo não é automático !";
		}
	}
	public String LigaCheckup() 
	{
		if (Liga == true) 
		{
			return "O veiculo funciona";
		}
		else 
		{
			return "O veiculo não funciona !";
		}
	}
}
