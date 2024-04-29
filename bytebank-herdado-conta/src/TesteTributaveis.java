public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto imposto = new CalculadorDeImposto();
        imposto.registra(cc);
        imposto.registra(seguro);

        System.out.println(imposto.getTotalImposto());
    }
}
