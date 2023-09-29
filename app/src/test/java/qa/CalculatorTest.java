package qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
   
    @Test
    public void verifyAdditionPar(){
        Calculator calculator = new Calculator();
        int actualResult=calculator.add(2,2);
        int expectedResult=4;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }
    @Test
    public void verifyAdditionImpar(){
        Calculator calculator = new Calculator();
        int actualResult=calculator.add(3,3);
        int expectedResult=6;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    public void verifyAdditionImparPar(){
        Calculator calculator = new Calculator();
        int actualResult=calculator.add(2,3);
        int expectedResult=5;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }
}
