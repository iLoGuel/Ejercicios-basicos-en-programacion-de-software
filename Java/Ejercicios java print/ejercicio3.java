import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor numerico: ");
        x = sc.nextInt();
        System.out.println("El valor ingresado es: " +x);
        System.out.println("El doble es: "+x*2);
        System.out.println("El triple es: "+x*3);
    }
}