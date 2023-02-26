// 9. Codigo java que me permita leer un numero entero de dos digitos y determinar si un digito es multiplo de otro

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 99) {
            int digito1 = num / 10;
            int digito2 = num % 10;
            if (digito1 != 0 && digito2 != 0 && digito1 % digito2 == 0) {
                System.out.println("El primer dígito es múltiplo del segundo.");
            } else if (digito2 != 0 && digito1 % digito2 == 0) {
                System.out.println("El segundo dígito es múltiplo del primer.");
            } else {
                System.out.println("Ningún dígito es múltiplo del otro.");
            }
        } else {
            System.out.println("El número ingresado no es de dos dígitos.");
        }
    }
}
