public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel g) {
        boolean autentuciou = g.autentica(this.senha);
        if (autentuciou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
