package Archivos;

/**
 *
 * @author Ricardo
 */
public class Comandos {
    
    public String instruccion;
    public String A;
    public String B;
   
    public Comandos(String instruccion,String A, String B){
        this.instruccion = instruccion;
        this.A = A;
        this.B = B;
    }
    
    public int LD (String A, String B){
        int resultado=0;
        if (A.length == 1 && B.length == 1){
            
        
        return resultado;
    }
    
    /*public static int Hex_Dec(String hexadecimal){
        int decimal;
        //Proceso
        return decimal;
    }
    
    public static String Dec_Hex(int Decimal){
        String hexadecimal;
        //Proceso
        return hexadecimal;
    }*/
}
