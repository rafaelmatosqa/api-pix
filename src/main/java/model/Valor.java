package model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Valor {

    private String original;
    private Integer modalidadeAlteracao;
    private Retirada retirada;

}
