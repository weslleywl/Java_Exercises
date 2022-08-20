
public class Conta 
{
	double Saldo;
	int Agencia;
	int numero;
	String Titular;
	
	Conta(int n1, int n2)
	{
		Agencia = n1;
		numero = n2;
		return;
	}
	
	boolean Sacar(double valor)
	{
		if(this.Saldo >= valor)
		{
			this.Saldo -= valor;
			System.out.println("Saque no valor de " + valor + " efetuado com sucesso !");
			return true;
		}
		else
		{
			System.out.println("Saldo insuficiente para saque !");
			return false;
		}
	}
	void Depositar(double valor)
	{
		System.out.println("Depósito no valor de " + valor + " efetuado com sucesso !");
		this.Saldo += valor;
	}
	boolean Transferir(double valor, ContaCorrente destino)
	{
		if(this.Saldo >= valor)
		{
			this.Saldo -= valor;
			destino.Saldo += valor;
			System.out.println("Transferência realizada com sucesso !");
			return true;
		}
		else
		{
			System.out.println("Saldo insuficiente para realizar transferência !");
			return false;
		}
	}
}
