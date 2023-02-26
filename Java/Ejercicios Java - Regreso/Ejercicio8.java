import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor por hora: ");
        int valorH = sc.nextInt();
        System.out.print("Ingrese las horas trabajadas: ");
        int horaT = sc.nextInt();
        System.out.print("Ingrese las horas extras trabajadas: ");
        int horaE = sc.nextInt();
        int op1 = valorH * horaT;
        int op2 = valorH * horaE;
        int porcentaje = (op2 / 100) * 135;

        System.out.println("Horas trabajadas: " + horaT);
        System.out.println("Total horas comunes: " + op1);
        System.out.println("Total horas extras: " + porcentaje);
        System.out.println("Total a pagar: " + (op1 + porcentaje));
    }
}
