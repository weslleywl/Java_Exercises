
public class Byte 
{
	public static void main (String[]args)
	{
		ContaCorrente cc = new ContaCorrente(113, 1232415);
		cc.Depositar(900);
		System.out.println("Seu saldo corrente atual � de " + cc.Saldo);
		
		ContaPoupanca cp = new ContaPoupanca(163, 893689);
		cp.Depositar(900);
		System.out.println("Seu saldo poupanca atual � de " + cp.Saldo);
		
		cc.Sacar(500);
		
		System.out.println("Seu saldo corrente atual � de " + cc.Saldo);
	}
}
