/* 1. Leer un numero un numero por el teclado que pida precio de un producto (Puede tener decimales) y calcule el precio final con IVA
 * El IVA será una constante que será 21%
*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        x = sc.nextInt();
        System.out.println("El valor original del productor es de: " + x);
        System.out.println("El valor del IVA es:" + (((x * 121) / 100) - x));
        System.out.println("El valor final del producto con IVA es de: " + (x * 121) / 100);
    }
}