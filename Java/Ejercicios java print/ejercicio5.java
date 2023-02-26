import java.util.Scanner;
public class main {
    public static void main(String[]args){
        String nombre;
        Float x, y, z;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la primer nota: ");
        x = sc.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        y = sc.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        z = sc.nextFloat();
        System.out.println("Para el estudiante " +nombre +" su promedio es de: " +(x+y+z)/3);
    }
}