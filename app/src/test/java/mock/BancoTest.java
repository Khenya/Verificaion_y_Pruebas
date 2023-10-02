package mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class BancoTest {
    ServiceASFI asfiMock = Mockito.mock(ServiceASFI.class);
    @ParameterizedTest
    @CsvSource(
            {
                    "6913512, A, Maximo a prestar 200000",
                    "3542441, B, Maximo a prestar 100000",
                    "4551012, C, no se puede prestar ningún monto ALERTA!"
            }
    )
    public void verifyMaxPrestamo(String ci, String categoria, String expected){
        Mockito.when(asfiMock.getCategoria(ci)).thenReturn(categoria);
        Banco banco = new Banco();
        banco.setAsfi(asfiMock);
        String actual = banco.getMaximoPrestamo(ci);
        Assertions.assertEquals(expected, actual, "ERROR: categoria o prestamo incorrecto");
        Mockito.verify(asfiMock).getCategoria(ci);
    }
}