
public class ContaCorrente extends Conta
{
	ContaCorrente(int n1, int n2)
	{
		super(n1,n2);
	}
	
	@Override
	public boolean Sacar(double valor)
	{
		if(this.Saldo >= valor)
		{
			double valortaxa = valor + 0.5;
			this.Saldo -= valortaxa;
			System.out.println("Saque no valor de " + valor + " efetuado com sucesso !");
			System.out.println("Foi cobrada uma taxa de 50 centavos pelo saque !");
			return true;
		}
		else
		{
			System.out.println("Saldo insuficiente para saque !");
			return false;
		}
	}
}
