/* Pedir dos palabras por teclado , indicar si son iguales */

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
        palabra1 = sc.nextLine();
        System.out.println("Ingrese la seguda palabra");
        palabra2 = sc.nextLine();
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras ingresadas son la misma");
        } else {
            System.out.println("Las palabras ingresadas no son la misma");
        }
    }
}