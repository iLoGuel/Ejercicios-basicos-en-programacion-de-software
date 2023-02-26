import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Ingrese sueldo basico: ");
        int sueldoB = sc.nextInt();

        int aporteISS = (((sueldoB / 100) * 104) - sueldoB);
        double aporteP = (((sueldoB / 100) * 103.375) - sueldoB);

        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo basico: " + sueldoB);
        System.out.println("Aporte ISS: -" + aporteISS);
        System.out.println("Aporte Pension: -" + aporteP);
        System.out.println("Total en aportes: " + (aporteISS + aporteP));
        System.out.println("Total sueldo: " + (sueldoB - (aporteISS + aporteP)));
    }
}
