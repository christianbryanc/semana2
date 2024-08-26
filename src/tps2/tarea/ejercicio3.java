
package tps2.tarea;

import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        //Creando el objeto lectura
        Scanner lectura=new Scanner (System.in);
        
        //Variables
        double capitalI, tasaInteres, capitalF;
        int tiempo;
              
        //Entrada de datos
        System.out.print("Ingrese el capital inicial: ");
        capitalI = lectura.nextDouble();
        System.out.print("Ingrese la tasa de interes anual: ");
        tasaInteres = lectura.nextDouble();
        System.out.print("Ingresa el tiempo en años: ");
        tiempo = lectura.nextInt();

        //Proceso de datos
        capitalF = capitalI * Math.pow((1 + tasaInteres / 100), tiempo);

       
        //Salida de datos
        System.out.println("El capital final despues de "+tiempo+" años es: " +capitalF);
        
        
        
        
        
}
}