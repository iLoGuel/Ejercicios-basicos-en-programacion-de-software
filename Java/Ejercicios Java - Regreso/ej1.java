
//2. Codigo java que me permita leer un numero entero y determinar si es de 3 digitos.
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("El número es de 3 dígitos.");
        } else {
            System.out.println("El número no es de 3 dígitos.");
        }
    }
}
