
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        var iva = (45000*119)/100;
        System.out.println("El costo inicial del producto es de: $45000");
        System.out.println("El valor del IVA es de: $" +(iva-45000));
        System.out.println("El costo del producto con IVA inclido es de: $" +iva);
    }
}