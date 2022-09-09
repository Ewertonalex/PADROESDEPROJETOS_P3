package TedHeranca;

public class Cliente extends Pessoa {

    private String codigo;
    private String profissao;

    public Cliente(String nome, String dataNascimento, String endereco, String contato, String cargo, String codigo, String profissao) {
        super(nome, dataNascimento, endereco, contato, cargo);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
