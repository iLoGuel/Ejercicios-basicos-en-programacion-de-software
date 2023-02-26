import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el código del estudiante: ");
        int codigo = sc.nextInt();
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.next();
        System.out.println("Ingrese la nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Ingrese la nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Ingrese la nota 3: ");
        double nota3 = sc.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio del estudiante " + nombre + " con código " + codigo + " es " + promedio);
    }
}
