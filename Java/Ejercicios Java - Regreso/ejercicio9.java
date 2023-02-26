import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del trabajador: ");
        String nombre = sc.nextLine();

        System.out.print("Numero de horas trabajadas al mes: ");
        int horas = sc.nextInt();

        int sueldoBasico = horas * 4800;
        double descuentoISS = sueldoBasico * 0.04;
        double descuentoPension = sueldoBasico * 0.03375;
        double descuentoCooperativa = sueldoBasico * 0.05;

        double totalDescuentos = descuentoISS + descuentoPension + descuentoCooperativa;
        double sueldoNeto = sueldoBasico - totalDescuentos;

        System.out.println("Sueldo basico: " + sueldoBasico);
        System.out.println("Descuento ISS: " + descuentoISS);
        System.out.println("Descuento Pension: " + descuentoPension);
        System.out.println("Descuento Cooperativa: " + descuentoCooperativa);
        System.out.println("Total descuentos: " + totalDescuentos);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}