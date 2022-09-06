package aula03Emcap;

public class EncapsulamentoApp {
    public static void main(String[] args) {
        Encapsulado e = new Encapsulado();
        //e.comProtecao = 10;
        e.setComProtecao(10);
        System.out.println("Valor com proteção: " + e.getComProtecao());
    }
}
