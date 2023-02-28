import datafactory.CobrancaImediataDataFactory;
import model.Payload;
import org.testng.annotations.Test;

public class CobrancaTest {


    @Test
    public void test_Cobranca() {
        CobrancaImediataDataFactory cobrancaImediataDataFactory = new CobrancaImediataDataFactory();

        Payload bodyRequest = cobrancaImediataDataFactory.criarCobranca();
        System.out.printf("Meu body request: "+bodyRequest);


    }
}
