
package tps2.tarea;

import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        //Creando el objeto lectura
        Scanner lectura=new Scanner (System.in);
        
        //Variables
        double cateto1, cateto2, hipotenusa, area, angulo1, angulo2, angulo1Grados, angulo2Grados;
        
        //Entrada de datos
        System.out.print("Ingresa el primer cateto: ");
        cateto1 = lectura.nextDouble();
        System.out.print("Ingresa el segundo cateto: ");
        cateto2 = lectura.nextDouble();

        //Proceso de datos
        hipotenusa = Math.hypot(cateto1, cateto2);
        area = 0.5 * cateto1 * cateto2;
        angulo1 = Math.asin(cateto1 / hipotenusa); 
        angulo2 = Math.asin(cateto2 / hipotenusa); 
        angulo1Grados = Math.toDegrees(angulo1);
        angulo2Grados = Math.toDegrees(angulo2);

        //Salida de datos
        System.out.println("La hipotenusa del triangulo es: " +hipotenusa);
        System.out.println("El area del triangulo es: " +area);
        System.out.println("El angulo opuesto al primer cateto es: " +angulo1Grados+ " grados");
        System.out.println("El angulo opuesto al segundo cateto es: " +angulo2Grados+ " grados");
        
        
      
    }
    
}
