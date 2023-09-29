package inversion;

public class InvertirNumero {
    public String invertirNumero(int numero){
        if (numero >= 0) {
            String numeroString = String.valueOf(numero);
            StringBuilder numeroinvertido = new StringBuilder(numeroString);
            numeroinvertido.reverse();
            return numeroinvertido.toString();
        } else {
            return "Valor Incorrecto";
        }
        
    }
}
