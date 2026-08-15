package br.com.alura.screenmatch.desafios;

public enum desafio8Enum {
    OK(200, "Success"),
    BAD_REQUEST(400, "The server cannot or will not process the request"),
    UNAUTHORIZED(401, "The client request has not been Authorized"), 
    NOT_FOUND(404, "The server cannot find the requested resource"),
    INTERNAL_SERVER_ERROR(500, "The server encountered an unexpected condition and could not complete the user's request.");

    private Integer codigoErro;
    private String descricao;

    desafio8Enum(Integer codigoErro, String descricao){
    this.codigoErro = codigoErro;
    this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigoErro;
    }

    public String getDescricao(){
        return descricao;
    }
    
}
