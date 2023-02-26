import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    Double num1 = sc.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    Double num2 = sc.nextDouble();

    System.out.println("Suma: " + (num1 + num2));
    System.out.println("Resta: " + (num1 - num2));
    System.out.println("Multiplicación: " + (num1 * num2));
    System.out.println("División: " + (num1 / num2));
    System.out.println("Potencia: " + Math.pow(num1, num2));
  }
}
