package mock;

public class Banco {

    ServiceASFI serviceASFI;

    public Banco(){
        this.serviceASFI = new ServiceASFI();
    }

    public void setAsfi(ServiceASFI serviceASFI) {
        this.serviceASFI = serviceASFI;
    }

    public String getMaximoPrestamo(String ci){
        String categoria = serviceASFI.getCategoria(ci);
        switch (categoria) {
            case "A":
                return "Maximo a prestar 200000";
            case "B":
                return "Maximo a prestar 100000";
            case "C":
                return "no se puede prestar ningún monto ALERTA!";
            default:
                return "ERROR - Categoría inexistente!";
        }
    }
}