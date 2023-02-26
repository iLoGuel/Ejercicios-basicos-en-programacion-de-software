import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor numerico: ");
        x = sc.nextInt();
        System.out.println("Ingrese el segundo valor numerico: ");
        y = sc.nextInt();
         System.out.println("Los numeros ingresados fueron: "+x+" y "+y);
        if (x > y) {
            System.out.println("El " +x +" es mayor que " +y);
        } 
        else {
            System.out.println("El " +y +" es mayor que " +x);
        }
    }
}