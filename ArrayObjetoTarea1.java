/*
 * 
 */
package arrayobjetotarea1;

/**
 *
 * @author Ana Pico Solis
 */
class Escape_Gases{
    public double entrada_biodiesel;
    public double salida_mezcla;
    public double carga_motor;
    public String tipo_gas;

    
    Escape_Gases(double entrada_biodiesel, double salida_mezcla, double carga_motor, String tipo_gas){
    this.entrada_biodiesel = entrada_biodiesel;
    this.salida_mezcla = salida_mezcla;
    this.carga_motor = carga_motor;
    this.tipo_gas = tipo_gas;
    } 
}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("             INGENIERIA AUTOMOTRIZ");
        System.out.println("Nombre: Pico Solis Ana Graciela");
        System.out.println("Materia: Programación ");
        System.out.println("NRC: 7450");
        
        Escape_Gases [] arreglo;
        arreglo= new Escape_Gases [10];
        arreglo[0]= new Escape_Gases (7.5, 15.4 , 11.8, " O2 ");
        arreglo[1]= new Escape_Gases (7.5 , 2.6, 11.8, " CO2 ");
        arreglo[2]= new Escape_Gases (7.5, 600, 11.8, "CO ");
        arreglo[3]= new Escape_Gases (7.5, 17, 11.8, " HC ");
        arreglo[4]= new Escape_Gases (7.5, 75, 11.8, " NO ");
        arreglo[5]= new Escape_Gases (7.5, 9.4, 11.8, " con OPACIDAD ");
        arreglo[6]= new Escape_Gases (7.5, 17, 11.8, "NO2 ");
        arreglo[7]= new Escape_Gases (7.5, 20, 11.8, " HOLLÍN ");
        arreglo[8]= new Escape_Gases (7.5, 6.8, 11.8, "S");
        arreglo[9]= new Escape_Gases (7.5, 19.7, 11.8, " MERCURIO");
       
        
        for (int i=0; i<arreglo.length;i++)
                System.out.println("Elemento en la posición " +i+ " es : El gas "+arreglo[i].tipo_gas+
                        " Tiene una entrada de Biodiesel de Higuerilla de "
                +arreglo[i].entrada_biodiesel+",\n con una carga de motor de : "+arreglo[i].carga_motor+
                        ", y una salida de mezcla: "+arreglo[i].salida_mezcla+".");
    }
}
