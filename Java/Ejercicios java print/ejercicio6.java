import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x, y;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer valor numerico: ");
        x = sc.nextInt();
        System.out.println("Ingrese el segundo valor numerico: ");
        y = sc.nextInt();
        var suma = x+y;
        var resta = x-y;
        var multiplicacion = x*y;
        var divicion = x%y;
        System.out.println("La suma de " +x+" y " +y +" es igual a: " +suma);
        System.out.println("La resta de " +x+" y " +y +" es igual a: " +resta );
        System.out.println("La multiplicacion de " +x+" y " +y +" es igual a: " +multiplicacion);
        System.out.println("La divicion de " +x+" y " +y +" es igual a: " +divicion);
    }
}