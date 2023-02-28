package datafactory;


import model.*;

import java.util.List;

public class CobrancaImediataDataFactory {

    public Payload criarCobranca() {

        return Payload.builder()
                .calendario(Calendario.builder()
                        .expiracao(3600)
                        .build())
                .devedor(Devedor.builder()
                        .cnpj("12345678000195")
                        .nome("Empresa de Serviços SA")
                        .build())
                .valor(Valor.builder()
                        .original("37.00")
                        .modalidadeAlteracao(1)
                        .build())
                .chave("7d9f0335-8dcc-4054-9bf9-0dbd61d36906")
                .solicitacaoPagador("Serviço realizado.")
                .infoAdicionais(List.of(
                                InfoAdicional.builder()
                                        .nome("Campo 1")
                                        .valor("Informação Adicional 1 do PSP-Recebedor")
                                        .build(),
                                InfoAdicional.builder()
                                        .nome("Campo 2")
                                        .valor("Informação Adicional 2 do PSP-Recebedor")
                                        .build()
                        )
                ).build();


    }

}
