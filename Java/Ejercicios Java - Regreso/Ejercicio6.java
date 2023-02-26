import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la referencia: ");
        String referencia = sc.nextLine();
        System.out.print("Ingrese nombre del articulo: ");
        String nombreA = sc.nextLine();
        System.out.print("Ingrese valor unitario: ");
        int valorU = sc.nextInt();
        System.out.print("Ingrese unidades disponibles: ");
        int unidades = sc.nextInt();

        System.out.println("Referencia del producto: " + referencia);
        System.out.println("Nombre del articulo: " + nombreA);
        System.out.println("Valor unitario: " + valorU);
        System.out.println("Unidades disponibles: " + unidades);
        System.out.println("Valor unitario con IVA: " + ((valorU / 100) * 119));
    }
}
