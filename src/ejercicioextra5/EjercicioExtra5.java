/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejercicioextra5;

import java.util.Scanner;

public class EjercicioExtra5 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Ingresa el tipo de socio (A/B/C): ");
        String socio = entrada.nextLine();
        
        System.out.print("Ingresa el valor del costo del tratamiento: ");
        int valor = entrada.nextInt();
        
        switch(socio){
            case "A":
                System.out.println("Tienes el 50% de descuento del tratamiento, el total a pagar es: "+(valor-(valor*0.5)));
                break;
            case "B":
                System.out.println("Tienes el 35% de descuento del tratamiento, el total a pagar es: "+(valor-(valor*0.35)));
                break;
            case "C":
                System.out.println("No tienes descuento, el valor a pagar es: "+valor);
                break;
            default:
                System.out.println("Error, el tipo de socio ingresado es incorrecto");
        }
    }
    
}
