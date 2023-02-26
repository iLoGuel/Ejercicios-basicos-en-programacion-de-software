
/* 5. Crear un algoritmo que muestre el menu de un restaurante de comidas rapidas.
 * El programa debe solicitar al cliente el tipo de producto, la opción si es especial
 * o sencillo, el valor para cada tipo de opcion y el precio segun la cantidad de productos
 * solicitados. El algoritmo en la parte inicial debe desplegar todo el menu para que el cliente
 * pueda visualizar lo que desea ordenar.
 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int opcion, operacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("|===============================================|");
        System.out.println("|Bienvenido al restaurante | Esta es la cartilla|");
        System.out.println("|===============================================|");
        System.out.println("|Seleccione una opcion segun su necesidad       |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|1. Oferta Especial    |   2. Oferta sencilla   |");
        System.out.println("|_______________________________________________|");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("|===============================================|");
                System.out.println("|El menu especial es el siguiente:              |");
                System.out.println("|-----------------------------------------------|");
                System.out.println("|1. Hamburgesa doble carne         | $ 10.000   |");
                System.out.println("|2. Perro caliente doble extra hot | $ 8.000    |");
                System.out.println("|3. Presa de pollo apanado 2 x 1   | $ 8.000    |");
                System.out.println("|4. Doble arepa bugger             | $ 5.000    |");
                System.out.println("|5. Burrito extra largo            | $ 14.000   |");
                System.out.println("|===============================================|");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Hamburgesa doble carne         | $ 10.000      |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (10000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 2:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Perro caliente doble extra hot | $ 8.000       |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (8000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 3:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Presa de pollo apanado 2 x 1   | $ 8.000       |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (8000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 4:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Doble arepa bugger             | $ 5.000       |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (5000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 5:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Burrito extra largo            | $ 14.000      |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (14000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    default:
                        System.out.println("|===============================================|");
                        System.out.println("|La opcion ingresada no esta dentro de la lista |");
                        System.out.println("|===============================================|");
                }
                break;
            case 2:
                System.out.println("|===============================================|");
                System.out.println("|El menu especial es el siguiente:              |");
                System.out.println("|-----------------------------------------------|");
                System.out.println("|1. Hamburgesa                     | $ 5.000   |");
                System.out.println("|2. Perro caliente                 | $ 4.000    |");
                System.out.println("|3. Presa de pollo apanado         | $ 4.000    |");
                System.out.println("|4. Arepa bugger                   | $ 2.500    |");
                System.out.println("|5. Burrito                        | $ 7.000   |");
                System.out.println("|===============================================|");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Hamburgesa doble carne          | $ 5.000      |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (5000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 2:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Perro caliente doble extra hot | $ 4.000       |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (4000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("|La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 3:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Presa de pollo apanado 2 x 1   | $ 4.000       |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (4000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 4:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Doble arepa bugger             | $ 2.500       |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (2500 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    case 5:
                        System.out.println("|===============================================|");
                        System.out.println("|Seleccionaste:                                 |");
                        System.out.println("|Burrito extra largo             | $ 7.000      |");
                        System.out.println("|-----------------------------------------------|");
                        System.out.println("|Ingresa la cantidad:                           |");
                        System.out.println("|===============================================|");
                        opcion = sc.nextInt();
                        operacion = (7000 * opcion);
                        System.out.println("|===============================================|");
                        System.out.println("La cantidad es de " + opcion + ". Total a pagar:" + operacion + " pesos.");
                        System.out.println("|===============================================|");
                        break;
                    default:
                        System.out.println("|===============================================|");
                        System.out.println("|La opcion ingresada no esta dentro de la lista |");
                        System.out.println("|===============================================|");
                }
                break;
        }
    }
}
