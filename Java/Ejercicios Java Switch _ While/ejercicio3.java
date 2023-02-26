import java.util.Scanner;
public class CiclosClass {
    public static void main(String[]args){
        int num_user;
        var intentos = 10;
        var num_random = 0;
        var cont = 0;
        String ayuda = "Aqui recibiras una ayuda";
        Scanner sc = new Scanner (System.in);
        for (int i = 1; i <= 100; i++){
            num_random = (int) (Math.random() * 100 + 1);
            break;
        }
        System.out.println(num_random);
        do {
            
            System.out.println("==========================================================");
            System.out.println("Adivina el numero en un rango del 1 al 100");
            System.out.println("==========================================================");
            System.out.println("Tienes un total de: " +intentos+" intentos || " +ayuda);
            System.out.println("==========================================================");
            System.out.println("Ingresa un numero: ");
            num_user = sc.nextInt();
            cont += 1;
            intentos = intentos - 1;
            
            if (num_user > num_random){
                ayuda = "El numero ingresado fue mayor";

            }
             if (num_user < num_random){
                ayuda = "El numero ingresado fue menor";
             }
             
             if (num_user == num_random){
                System.out.println("==========================================================");
                System.out.println("Felicidades, el numero aleatorio es: "+num_random+", has acertado en numero en un total de: " +cont+" intentos");
                System.out.println("==========================================================");
                break;
             }
            
        } while (intentos != 0);
        if (intentos == 0){
            System.out.println("==================================================================");
            System.out.println("El juego ha terminado - El numero era: " +num_random);
            System.out.println("==================================================================");
        }
        else {
            System.out.println("==================================================================");
            System.out.println("El juego ha terminado");
            System.out.println("==================================================================");
        }
            
    }
}