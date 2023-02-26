/* Ordenar 3 numeros de mayor a menor */

import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor numerico: ");
        x = sc.nextInt();
        System.out.println("Ingrese el segundo valor numerico: ");
        y = sc.nextInt();
        System.out.println("Ingrese el tercer valor numerico: ");
        z = sc.nextInt();
         System.out.println("Los numeros ingresados fueron: "+x+", "+y+" y "+z);
        if (x==y && y==z) {
            System.out.println("Los valores ingresados son iguales, por favor intente nuevamente con valores diferentes");
        }
        else {
            if (x>y && x>z){
                System.out.println("El orden es el siguente de mayor a menor: ");
                System.out.println(x);
                if (y>z) {
                    System.out.println(y);
                    System.out.println(z);
                }
                else {
                    System.out.println(z);
                    System.out.println(y);
                }
            }
            if (y>x && y>z){
                System.out.println("El orden es el siguente de mayor a menor: ");
                System.out.println(y);
                if (x>z) {
                    System.out.println(x);
                    System.out.println(z);
                }
                else {
                    System.out.println(z);
                    System.out.println(x);
                }
            }
            if (z>x && z>y){
                System.out.println("El orden es el siguente de mayor a menor: ");
                System.out.println(z);
                if (x>y) {
                    System.out.println(x);
                    System.out.println(y);
                }
                else {
                    System.out.println(y);
                    System.out.println(x);
                }
            }
        }
    }
}