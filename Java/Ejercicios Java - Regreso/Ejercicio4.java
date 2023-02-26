import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
    double temperaturaFahrenheit = sc.nextDouble();

    double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
    System.out.println("La temperatura en grados Celsius es: " + temperaturaCelsius);

    System.out.print("Ingrese la temperatura en grados Celsius: ");
    temperaturaCelsius = sc.nextDouble();

    temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
    System.out.println("La temperatura en grados Celsius es: " + temperaturaFahrenheit);
  }
}
