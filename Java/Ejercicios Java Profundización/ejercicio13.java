/* Programa que lea una variable entera mes y compruebe si el valor corresponde a
un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
mostrará además el nombre del mes. Se debe comprobar que el valor
introducido esté comprendido entre 1 y 12. 
 */

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor numerico del 1 al 12: ");
        numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El mes ingresado es Enero");
                System.out.println("Este mes tiene 31 dias");
                break;
            case 2:
                System.out.println("El mes ingresado es Febrero");
                System.out.println("Este mes tiene 28 dias");
                break;
            case 3:
                System.out.println("El mes ingresado es Marzo");
                System.out.println("Este mes tiene 31 dias");
                break;
            case 4:
                System.out.println("El mes ingresado es Abril");
                System.out.println("Este mes tiene 30 dias");
                break;
            case 5:
                System.out.println("El mes ingresado es Mayo");
                System.out.println("Este mes tiene 31 dias");
                break;
            case 6:
                System.out.println("El mes ingresado es Junio");
                System.out.println("Este mes tiene 30 dias");
                break;
            case 7:
                System.out.println("El mes ingresado es Julio");
                System.out.println("Este mes tiene 31 dias");
                break;
            case 8:
                System.out.println("El mes ingresado es Agosoto");
                System.out.println("Este mes tiene 31 dias");
                break;
            case 9:
                System.out.println("El mes ingresado es Septiembre");
                System.out.println("Este mes tiene 30 dias");
                break;
            case 10:
                System.out.println("El mes ingresado es Octubre");
                System.out.println("Este mes tiene 31 dias");
                break;
            case 11:
                System.out.println("El mes ingresado es Noviembre");
                System.out.println("Este mes tiene 30 dias");
                break;
            case 12:
                System.out.println("El mes ingresado es Diciembre");
                System.out.println("Este mes tiene 31 dias");
                break;
            default:
                System.out.println("El valor ingresado no es correcto");
                break;
        }

    }
}