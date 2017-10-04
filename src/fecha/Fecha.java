package fecha;
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Fecha(int d, int m, int a) {
        dia = d;
        mes = m;  
        año = a;

       /* if (!fechaCorrecta()) {
            Calendar fechaSistema = Calendar.getInstance();
            setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
            setMes(fechaSistema.get(Calendar.MONTH));
            setAño(fechaSistema.get(Calendar.YEAR));
        }*/
    }
       private boolean esBisiesto() {
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }
       public void setDia(int d) {
       dia = d;
    }

    
}
