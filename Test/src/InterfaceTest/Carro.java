package InterfaceTest;

public class Carro implements Veiculo
{
	@Override
	public boolean veiculoLiga() 
	{
		return true;
	}
	@Override
	public boolean veiculoTemRodas() 
	{
		return true;
	}
	@Override
	public boolean veiculoTemMotor() 
	{
		return true;
	}
}
