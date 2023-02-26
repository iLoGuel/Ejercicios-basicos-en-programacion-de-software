/* Realizar una aplicacion que nos pida un numero de ventas a introducir, despues nos pedira tantas ventas por teclado como numeros
 * de ventas. Piensa que es lo que se repite y lo que no. Utiliza el ciclo for.
 */

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, venta;
        var total = 0;
        System.out.println("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el valor de la venta: ");
            venta = sc.nextInt();
            total += venta;
        }
        System.out.println("El total es de: " + total);
    }
}
