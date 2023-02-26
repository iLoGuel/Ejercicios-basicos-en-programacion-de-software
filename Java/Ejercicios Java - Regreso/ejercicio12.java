import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su estatura en metros: ");
        double estatura = sc.nextDouble();
        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        if (edad >= 18 && edad <= 22 && estatura >= 1.75 && peso >= 65) {
            System.out.println("Felicitaciones, cumples con los requisitos para la selección de baloncesto.");
        } else {
            System.out.println("Lo siento, no cumples con los requisitos para la selección de baloncesto.");
        }
    }
}