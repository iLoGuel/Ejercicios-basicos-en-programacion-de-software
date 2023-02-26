/* Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente: si el pago se efectua al "contado", calcular un descuento de 5%, pero si el pago es con "tajeta" se incrementa un recargo de %3 al valor de compra. Calcular y visualizar el descuento o recargo segun sea el caso y el total a pagar de la compra. */

import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int valor, opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al nuestro sistema");
        System.out.println("Ingrese el valor base del producto: ");
        valor = sc.nextInt();
        System.out.println("Como se realizara el pago?");
        System.out.println("1. Al contado");
        System.out.println("2. Tarjeta");
        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();
        
        if (opcion == 1){
            var porcentaje = (valor*5)/100;
            System.out.println("El valor original es de: "+valor);
            System.out.println("El 5% del valor original de descuento es: -"+ porcentaje);
            System.out.println("El valor con el 5% de descuento es: "+(valor-porcentaje));
        }
        else if (opcion == 2){
            var porcentaje = (valor*103)/100;
            System.out.println("El valor original es de: "+valor);
            System.out.println("El 3% del valor original de incremento es:+"+(porcentaje-valor));
            System.out.println("El valor con el 3% de incremento es: "+porcentaje);
        }
        else {
            System.out.println("La opcion ingresada no es valida");
        }
    }
}