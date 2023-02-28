package model;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Retirada {
    private Saque saque;
    private Troco troco;
}
