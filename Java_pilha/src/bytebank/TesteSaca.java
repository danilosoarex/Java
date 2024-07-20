package bytebank;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(5517, 197458);

        conta.deposita(200.0);
        try {
            conta.saca(202.0);
        } catch(SaldoInsuficienteException ex){
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
