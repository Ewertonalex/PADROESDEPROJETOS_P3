package aula03;

public class ContaApp {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta conta2 = new Conta(2, "Monitor", 10000, 1000);
		Conta conta3 = new Conta(3, "Conta Master", 10000);
		//ContaRemunerada contaRem = new ContaRemunerada();
		
		
		System.out.println(conta3.contaDependente.nome);	
		
		c.limite = 1000;
		c.nome = "Monitora";
		c.saldo = 10000;
		c.numero = 1;
		
		System.out.println("Saldo inicial: " + c.saldo);
		
		System.out.println("Saldo inicial Conta 2 : " + conta2.saldo);
		
		c.sacar(200);
		
		conta2.sacar(200);
				
		System.out.println("Saldo após saque: " + c.saldo);
		
		System.out.println("Saldo após saque Conta 2: " + conta2.saldo);
		
		double novoSaldo = c.sacar(200, 1000000000);
		double novoSaldoC2 = conta2.sacar(200, 1000000);
		
		System.out.println("Saldo após saque do sonho: " + novoSaldo);
		
		System.out.println("Saldo após saque do sonho Conta 2: " + novoSaldoC2);
		
//		System.out.println(“Saldo inicial = “ + contaRem.getSaldo());
//		contaRem.deposito(100.00);
//		contaRem.aplicaRendimentos(0.05);
//		System.out.println(“Novo saldo = “ + contaRem.getSaldo());


	}

}
