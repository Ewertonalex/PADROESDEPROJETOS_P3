package TedPOOHeranca;


import java.util.Scanner;

public class Pessoa {
    String nome;
    String dataNascimento;
    String endereco;
    String contato;
    String cargo;
    int matricula;
    double salario;
    String dataAdmissao;
    String codigo;
    String profissao;


//metodos

    void mudarCargo(String cargo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite o novo cargo: ");
        String novoCargo = scan.nextLine();
        this.cargo = novoCargo;
    }
    void reajustarSalario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite o novo salário: ");
        double novoSalario = scan.nextDouble();
        this.salario = novoSalario;
    }


//construtor Funcionario

    public Pessoa(int matricula, String nome, String dataNascimento, String endereco, String contato, String cargo, double salario, String dataAdmissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

//construtor Cliente
    public Pessoa(String codigo, String nome, String dataNascimento, String endereco, String contato, String cargo, String profissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.cargo = cargo;
        this.profissao = profissao;

    }
}

