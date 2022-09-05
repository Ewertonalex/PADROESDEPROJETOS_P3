package aula02;

public class Conta {

    int numero;
    String nome;
    double saldo;
    double limite;
    
    void sacar(double qtd) {
        double novoSaldo = this.saldo - qtd;
        this.saldo = novoSaldo;
    }

    double sacar(double qtd, double saldo) {
        double novoSaldo = saldo - qtd;
        return novoSaldo;
    }

    public Conta() {
        System.out.println("Aqui está o construtor vazio");
    }

    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = 100000;
        int numeroContaDep = numero + 1;
        this.contaDependente = new Conta(numeroContaDep)
    }


}
