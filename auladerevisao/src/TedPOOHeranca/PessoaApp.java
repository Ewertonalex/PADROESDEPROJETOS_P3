package TedPOOHeranca;

public class PessoaApp {
    public static void main(String[] args) {

        //Funcionario
        Pessoa f = new Pessoa(0012, "Mano Jack", "12.12.2001", "Rua da Luz", "(83)99544-5555", "Gerente", 3000, "05/01/2021");

        System.out.println("===== Dados do Funcionário ===== \nNome: " + f.nome + "\nMatrícula: " + f.matricula + "\nData de Nascimento: " + f.dataNascimento + "\nEndereço: " + f.endereco + "\nContato: " + f.contato + "\nCargo: " + f.cargo + "\nSalário: " + f.salario + "\nData de Admissão: " + f.dataAdmissao);

        f.mudarCargo("cargo");
        f.reajustarSalario();
        System.out.println("\nO novo cargo do funcionário é :" + f.cargo);
        System.out.println("\nO novo salário do funcionário é :" + f.salario);
        System.out.println("\n\n===== Dados ATUALIAZADOS do Funcionário ===== \nNome: " + f.nome + "\nMatrícula: " + f.matricula + "\nData de Nascimento: " + f.dataNascimento + "\nEndereço: " + f.endereco + "\nContato: " + f.contato + "\nCargo: " + f.cargo + "\nSalário: " + f.salario + "\nData de Admissão: " + f.dataAdmissao);

        //Cliente
        Pessoa c = new Pessoa("125", "Túlio Maravilha", "12/12/2000", "Rua Azul", "225221", "Atacante", "Jogador de Futebol");

        System.out.println("\n\n===== Dados do Cliente ===== \nNome: " + c.nome + "\nCódigo: " + c.codigo + "\nData de Nascimento: " + c.dataNascimento + "\nEndereço: " + c.endereco + "\nContato: " + c.contato + "\nCargo: " + c.cargo + "\nProfissão: " + c.profissao);

    }
}
