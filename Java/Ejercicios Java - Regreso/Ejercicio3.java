import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el radio de la circunferencia: ");
    double radio = sc.nextDouble();

    double area = Math.PI * Math.pow(radio, 2);
    System.out.println("El área de la circunferencia es: " + area);
  }
}
