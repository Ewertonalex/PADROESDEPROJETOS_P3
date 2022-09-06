package aula03Emcap;

public class EncapsulamentoApp {
    public static void main(String[] args) {
        NaoEncapsulado ne = new NaoEncapsulado();
        ne.semProtecao = 10;
        System.out.println("Valor sem proteção: " + ne.semProtecao);
    }
}
