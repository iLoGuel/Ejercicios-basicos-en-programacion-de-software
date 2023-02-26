/* Escribe un programa java que calcule el area de un triangulo y arroje resultado por pantalla */
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x, y;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la base: ");
        x = sc.nextInt();
         System.out.println("Ingrese la altura: ");
        y = sc.nextInt();
        System.out.println("El area del triangulo segun los valores ingresado es: " +(x*y)/2);
    }
}