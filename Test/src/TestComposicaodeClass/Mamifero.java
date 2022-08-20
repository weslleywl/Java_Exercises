package TestComposicaodeClass;

public class Mamifero 
{
	Animal Cachorro;
	Mamifero()
	{
		this.Cachorro = new Animal();
	}
	
	void EmitirSom()
	{
		this.Cachorro.EmitirSom();
	}
	void Alimentar()
	{
		this.Cachorro.Alimentar();
	}
	void movimentar()
	{
		this.Cachorro.Movimentar();
	}
}
