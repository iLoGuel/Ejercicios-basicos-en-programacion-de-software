import java.util.Scanner;
public class CiclosClass {
    public static void main(String[]args){
        int x;
        var mayor = 0;
        var menor = 0;
        var suma_todos = 0;
        var suma_positivos = 0;
        var suma_negativos = 0;
        var media = 0;
        var cont = 0;
        Scanner sc = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese un valor numerico");
            x= sc.nextInt();
            if (x != -1){
                suma_todos += x;
                cont += 1;
            
                if (x > mayor){
                    mayor = x;
                }
                if (menor == 0) {
                    menor = x;
                }
                if (menor > x) {
                    menor = x;
                }
                if (x > 0){
                    suma_positivos += x;
                }
                if (x < 0){
                    suma_negativos -= x;
                }
            
                media = (suma_todos / cont);
            }
        } while (x != -1);
        
        System.out.println("El mayor numero introducido es: " +mayor);
        System.out.println("El menor numero introducido es: " +menor);
        System.out.println("La suma de todos los numeros es: " +suma_todos);
        System.out.println("La suma de todos los numeros positivos es: " +suma_positivos);
        System.out.println("La suma de todos los numeros negativos es -: " +suma_negativos);
        System.out.println("la media de la suma: " +media);
    }
}