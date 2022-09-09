package TedHeranca;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José", "12.05.1980", "Av Epitacio", "839888-5566","Professor"
                , 8562, 2.500, "10.04.2020");



        Cliente cliente = new Cliente("Alberto", "19.05.1995", "Rua do Sol", "83987556696", "Gerente", "8456",
                "Administrador");

        System.out.println("Dados do funcionário: ");
    }

}
