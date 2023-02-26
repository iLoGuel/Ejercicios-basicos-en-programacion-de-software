/* Un postulante a un empleo realiza una prueba de capacitacion,
 * se obtuvo la siguiente informacion: cantidad total de preguntas que se realizaron
 * y la cantidad de preguntas que contesto correctamete. Se pide un programa que
 * ingrese los datos por teclado e informe el nivel de este segun el porcentaje
 * de respuestas correctas que se ha obtenido, y  sabendo que:
 * 
 * nivel maximo >=90%
 * nivel medio >=75% <=90%
 * nivel regular >=50% <=75%
 * fuera de nivel <50%
 */

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        int cantidad, correctas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de preguntas realizadas: ");
        cantidad = sc.nextInt();
        System.out.println("Ingrese la cantidad de respuestas correctas: ");
        correctas = sc.nextInt();
        var porcentaje = (correctas * 100) / cantidad;
        if (porcentaje >= 90) {
            System.out.println("Nivel maximo");
        } else if (porcentaje >= 75 && porcentaje <= 90) {
            System.out.println("Nivel Medio");
        } else if (porcentaje >= 50 && porcentaje <= 75) {
            System.out.println("Nivel Medio");
        } else if (porcentaje <= 50) {
            System.out.println("Fuera de Nivel");
        }
    }
}