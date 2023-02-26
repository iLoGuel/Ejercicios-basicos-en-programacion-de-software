/* Reemplezar del el String anterior la letra a por la e */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        String frase = "La lluvia en sevilla es una maravilla";
        frase = frase.replaceAll("a", "e");
        System.out.println(frase);
    }
}