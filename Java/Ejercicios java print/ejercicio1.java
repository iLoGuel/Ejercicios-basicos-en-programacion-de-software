import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x, y;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        x= sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        y= sc.nextInt();
        System.out.println("Estimado usuario, los dos numeros ingresado son: " +x+ " y " +y);
    }
}