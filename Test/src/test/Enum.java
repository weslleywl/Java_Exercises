package test;

public enum Enum 
{
	Manha("Manhã"),Tarde("Tarde"),Noite("Noite");
	
	String valor;
	
	Enum(String turno)
	{
		this.valor = turno;
	}
}
