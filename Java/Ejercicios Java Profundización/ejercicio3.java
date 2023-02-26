/* 2. Modificar el ejercicio anterior, para que en lugar de pedir un numero, pida un caracter (char) y muestre su codigo en la tabla */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el caracter: ");
        x = sc.nextLine().charAt(0);
        System.out.println("El caracter ingresado es: " + x);
    }
}