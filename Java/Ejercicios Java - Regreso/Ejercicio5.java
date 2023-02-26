import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el valor de A: ");
    double a = sc.nextDouble();
    System.out.print("Ingrese el valor de B: ");
    double b = sc.nextDouble();
    System.out.print("Ingrese el valor de C: ");
    double c = sc.nextDouble();

    double cuadrado_de_la_suma = Math.pow(a + b + c, 2);
    double cubo_del_producto = Math.pow(a * b * c, 3);
    double producto = a * b * c;
    double diferencia = cuadrado_de_la_suma - producto;

    System.out.println("El cuadrado de la suma es: " + cuadrado_de_la_suma);
    System.out.println("El cubo del producto es: " + cubo_del_producto);
    System.out.println("El producto de los valores es: " + producto);
    System.out.println("La diferencia entre el cuadrado de la suma y el producto es: " + diferencia);
  }
}
