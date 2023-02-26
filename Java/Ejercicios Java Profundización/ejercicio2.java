/* 2. Leer un numero por teclado y muestra por consola, el caracter al que pertenece en la tabla ASCII. Por ejemplo, si introduce un 97 me muestre una "a" */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor numerico: ");
        x = sc.nextInt();
        char convertidor = (char) x;
        System.out.println("El caracter ingresado es: " + convertidor);
    }
}