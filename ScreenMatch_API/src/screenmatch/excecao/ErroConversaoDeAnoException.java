package screenmatch.excecao;

public class ErroConversaoDeAnoException extends RuntimeException {
    public String mensagem;
    public ErroConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
