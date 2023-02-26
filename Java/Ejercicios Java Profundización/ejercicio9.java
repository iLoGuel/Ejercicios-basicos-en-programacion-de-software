/* Del siguiente String <<La lluvia en sevilla es una maravilla>> cuenta cuantas vocaleshay en total (recorre el String con charAt) */

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        var cont = 0;
        Scanner sc = new Scanner(System.in);
        String frase = "La lluvia en sevilla es una maravilla";
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                cont++;
            }
        }
        System.out.println("La frase: <<" + frase + ">>");
        System.out.println("Tiene un total de: " + cont + " vocales.");
    }
}