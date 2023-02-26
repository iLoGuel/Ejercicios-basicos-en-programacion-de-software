/* Lea un numero del 0 al 99999, determinar cuantas cifras tiene */
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor numerico: ");
        x = sc.nextInt();
        if (x>=0 && x<10000){
            System.out.println("El valor ingresado es: " +x);
            if (x>=0 && x<=9) {
                System.out.println("El valor ingresado es de un digito");
            }
            else if (x>=10 && x<=99) {
                System.out.println("El valor ingresado es de dos digito");
            }
            else if (x>=100 && x<=999) {
                System.out.println("El valor ingresado es de tres digito");
            }
            else if (x>=1000 && x<=9999) {
                System.out.println("El valor ingresado es de cuatro digito");
            }
            else if (x>=10000 && x<=99999) {
                System.out.println("El valor ingresado es de cinco digito");
            }
        }
        else {
            System.out.println("El valor ingresado no es valido");
        }
    }
}