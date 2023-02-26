/* 4. Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el numero es positivo, nulo o negativo */

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor numerico: ");
        x = sc.nextInt();

        if (x > 0) {
            System.out.println("El valor ingresado es positivo");
        } else if (x == 0) {
            System.out.println("El valor ingresado es nulo");
        } else {
            System.out.println("El valor ingresado es negativo");
        }
    }
}