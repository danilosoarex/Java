public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario danilo = new Gerente();
        danilo.setNome("Danilo Soares");
        danilo.setCpf("12345678900");
        danilo.setSalario(6500.00);

        System.out.println(danilo.getNome());
        System.out.println(danilo.getBonificacao());
    }
}