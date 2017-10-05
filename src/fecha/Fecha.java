package fecha;
public class Fecha {
    public static int dia;
    public static int mes;
    public static int anyo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setDia(d);
        setMes(m);
        setAño(a);
        fantasma();
    
    }
    public static void setDia(int d) {
        dia = d;
    }
    public static void setMes(int m){
        mes = m;
    }
    public static void setAño(int a){
        anyo = a;
    }
    public static String fantasma(){
        boolean diaCorrecto, mesCorrecto, anyoCorrecto;
        anyoCorrecto = (anyo >0);
        mesCorrecto = (mes >=1) && (mes <=12);
        switch(mes){
            case 2:
                if(esBisiesto()){
                    diaCorrecto = (dia >= 1 && dia <= 29);
                }else{
                    diaCorrecto = (dia >= 1 && dia <= 28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = (dia >= 1 && dia <= 30);
                break;
            default:
                diaCorrecto = (dia >= 1 && dia <= 31);
        }
        return diaCorrecto + " / " + mesCorrecto + " / " + anyoCorrecto;
    }  
}
