package test;

public enum Enum 
{
	Manha("Manh�"),Tarde("Tarde"),Noite("Noite");
	
	String valor;
	
	Enum(String turno)
	{
		this.valor = turno;
	}
}
