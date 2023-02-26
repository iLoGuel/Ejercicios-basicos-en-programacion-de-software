// 14. Leer dos numeros numeros enteros de dos digitos y determinar a cuanto es igual la suma de todos sus digitos.

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese el primer numero entero de dos digitos");
            int valor1 = sc.nextInt();
            if (valor1 > 9 && valor1 < 100) {
                System.out.println("Ingrese el segundo numero entero de dos digitos");
                int valor2 = sc.nextInt();

                if (valor2 > 9 && valor2 < 100) {
                    // Codigo a seguir

                    var suma1Num1 = valor1 / 10;
                    var suma2Num1 = valor1 % 10;
                    var sumaNum1 = suma1Num1 + suma2Num1;

                    var suma1Num2 = valor2 / 10;
                    var suma2Num2 = valor2 % 10;
                    var sumaNum2 = suma1Num2 + suma2Num2;

                    System.out.println("La suma del primer valor ingresado es: " + sumaNum1);
                    System.out.println("La suma del primer valor ingresado es: " + sumaNum2);
                    System.out.println("La suma de ambos valores: " + (sumaNum1 + sumaNum2));
                    break;

                } else {
                    System.out.println("El valor ingresado no es valido...");
                }
            } else {
                System.out.println("El valor ingresado no es valido...");
            }

        } while (true);
    }
}