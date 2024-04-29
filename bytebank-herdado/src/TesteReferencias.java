public class TesteReferencias {

    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Fulano");
        g1.setSalario(5000.0);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500.0);

        Funcionario des = new Designer();
        des.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(des);
        System.out.println(controle.getSoma());
    }
}
