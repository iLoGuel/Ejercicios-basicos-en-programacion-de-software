import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la base del triángulo: ");
    Double base = sc.nextDouble();
    System.out.print("Ingrese la altura del triángulo: ");
    Double altura = sc.nextDouble();

    Double area = (base * altura) / 2;
    System.out.println("El área del triángulo es: " + area);
  }
}
