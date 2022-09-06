package aula02;

public class ContaApp {
    public static void main(String[] args) {

        Conta c = new Conta();
        Conta conta2 = new Conta(2, "Monitor", 10000, 1000);
        //Conta conta3 = new Conta(3, "Conta Master", 100000, 10000);
        c.limite = 1000;
        c.nome = "Monitora";
        c.saldo = 10000;
        c.numero = 1;

        System.out.println("Saldo inicial: " + c.saldo);

        System.out.println("Saldo inicial Conta 2: " + conta2.saldo);

        c.sacar(200);

        conta2.sacar(200);

        System.out.println("Saldo após saque: " + c.saldo);

        System.out.println("Saldo após saque conta 2: " + conta2.saldo);

        double novoSaldo = c.sacar(200, 1000000);

        double novoSaldoC2 = conta2.sacar(200, 1000000);

        System.out.println("Saldo após saque do sonho: " + novoSaldo);

        System.out.println("Saldo após saque do sonho conta 2: " + novoSaldoC2);

    }
}
