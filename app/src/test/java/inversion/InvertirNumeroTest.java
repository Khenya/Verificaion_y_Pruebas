package inversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InvertirNumeroTest {
    //                 
    
    @ParameterizedTest
    @CsvSource(
            {
                    "-1,Valor Incorrecto",
                    "0,0",
                    "1,1",
                    "8,8",
                    "80,08",
                    "100,001",
                    "123,321",
                    "5718,8175",
                    "8210,0128",
                    "8897,7988",
                    "15678,87651",
                    "-1, Valor Incorrecto",
                    "-2, Valor Incorrecto",
                    "-2450, Valor Incorrecto"
            }
    )
    public void verifyGetMessage(int numero, String expectedResult) {
        InvertirNumero n = new InvertirNumero();
        String actualResult = n.invertirNumero(numero);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR!el mensaje es incorrecto");
    }
}