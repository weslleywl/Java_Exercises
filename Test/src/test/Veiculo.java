package test;

public abstract class Veiculo 
{
	public boolean Rodas = false;
	public boolean Portas = false;
	public boolean Autom�tico = false;
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
			System.out.println("O veiculo n�o possui rodas !");
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
			return "O veiculo n�o possui portas !";
		}
	}
	public String AutomaticoCheckup() 
	{
		if (Autom�tico == true) 
		{
			return "O veiculo � sim autom�tico";
		}
		else 
		{
			return "O veiculo n�o � autom�tico !";
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
			return "O veiculo n�o funciona !";
		}
	}
}
