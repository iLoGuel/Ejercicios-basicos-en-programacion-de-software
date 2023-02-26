import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Las horas se pagan a $23.000");
        System.out.println("Ingrese el numero de horas trabajdas: ");
        x = sc.nextInt();
        var pago = 23000;
        System.out.println("El pago a recibir por horas trabajadas es de: $" +x*pago);
    }
}