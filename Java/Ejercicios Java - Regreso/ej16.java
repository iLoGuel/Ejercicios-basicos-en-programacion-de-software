// 16.Leer un numero enteri de 3 digitos y determinar si al menos dos de sus tres digitos son iguales.

import java.util.Scanner;

public class ej16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número de 3 dígitos: ");
    int num = sc.nextInt();
    int d1 = num / 100;
    int d2 = (num / 10) % 10;
    int d3 = num % 10;

    if (d1 == d2 || d2 == d3 || d1 == d3) {
      System.out.println("Dos o más dígitos son iguales.");
    } else {
      System.out.println("Ningún dígito es igual a otro.");
    }
  }
}

