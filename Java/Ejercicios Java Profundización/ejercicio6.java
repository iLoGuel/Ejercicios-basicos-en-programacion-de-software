/* En una venta de llanatas se ha establecido una promocion de llantas marca "ponchadas", dicha promocion consiste en lo siguiente:
 * Si se compra menos de cinco llantas el precio es de 30000 cada una, de $25000 si se compra de cinco a 10 y de $20000 si se compran mas de 10
 * Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra y la que tiene que pagar por el total
 * de la compra
*/

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la promoción de llantas");
        System.out.println("Ingrese el numero de llantas que desee:");
        x = sc.nextInt();
        var cont = 0;
        if (x > 0 && x <= 5) {
            System.out.println("La cantidad deseada ha sido: " + x);
            do {
                System.out.println("x1 llanta: $30000 ");
                cont += 1;
            } while (cont < x);
            System.out.println("Total a pagar: " + (30000 * x));
        } else if (x > 5 && x <= 10) {
            System.out.println("La cantidad deseada ha sido: " + x);
            do {
                System.out.println("x1 llanta: $25000 ");
                cont += 1;
            } while (cont < x);
            System.out.println("Total a pagar: " + (25000 * x));
        } else if (x > 10) {
            System.out.println("La cantidad deseada ha sido: " + x);
            do {
                System.out.println("x1 llanta: $20000 ");
                cont += 1;
            } while (cont < x);
            System.out.println("Total a pagar: " + (20000 * x));
        } else {
            System.out.println("El valor ingresado es incorrecto");
        }
    }
}