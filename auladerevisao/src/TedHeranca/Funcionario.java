package TedHeranca;

public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String dataNascimento, String endereco, String contato, String cargo, int matricula, double salario, String dataAdmissao) {
        super(nome, dataNascimento, endereco, contato, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
