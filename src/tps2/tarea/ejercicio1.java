
package tps2.tarea;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        //Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        
        //Variables
        double radio, area, perimetro;
        
        //Entrada de datos
        System.out.print("Ingrese el radio del circulo: ");
        radio=lectura.nextDouble();
        
        //Proceso de datos
        area=Math.PI * Math.pow(radio,2);
        perimetro=2*Math.PI*radio;
        area=Math.round(area);
        perimetro=Math.round(perimetro);
  
        //Salida de datos
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
        
        System.out.println("intento n ya me oolvide");
        
    }
    
}
