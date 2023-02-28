package model;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Devedor {

    private String cnpj;
    private String nome;

}
