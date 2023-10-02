package mock_ejemplo2;

public class CalculatorAdvanced {
    // private String name = "calculadora" ;
    public CalculatorAdvanced(){

    }

    public int getFactorial(int number){
        int f = 1;
        for (int i = 1; i <= number ; i++) {
            f = ServiceCalcStatic.mult(f,i);
        }
        return f;
    }
}
