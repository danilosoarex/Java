import javax.accessibility.AccessibleEditableText;

public class TesteSistema {
    public static void main (String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);


        Administrador adm = new Administrador();
        adm.setSenha(3333);
        SistemaInterno s2 = new SistemaInterno();
        s2.autentica(adm);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        SistemaInterno s3 = new SistemaInterno();
        s3.autentica(cliente);
    }
}
