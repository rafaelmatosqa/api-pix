package model;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Saque {

    private String valor;
    private Integer modalidadeAlteracao;
    private String modalidadeAgente;
    private String prestadorDoServicoDeSaque;


}
