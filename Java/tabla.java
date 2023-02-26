/*2. Mostrar la tabla de multiplicar de un número ingresado por teclado. 
 */

import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, multiplos;
        int menu = 0;
        do { // Bucle do-while infinito inicial en donde encontraremos el menú principal del
             // programa y la opcion de cierre del mismo.
            if (menu == 2) { // Condicional que permite el cierre del programa según esté indicado en la
                             // variable menu.
                System.out.println("==========================================");
                System.out.println("|programa cerrado...                     |");
                System.out.println("==========================================");
                break;
            } else { // Lado falso de la condicinal de cierre en el cual mostrará el menu principal
                     // junto con las opciones del mismo.
                System.out.println("==========================================");
                System.out.println("| Bienvenido a las tablas de multiplicar |");
                System.out.println("|----------------------------------------|");
                System.out.println("| Programa que te permitira conocer las  |");
                System.out.println("| tablas de multiplicar de un numero     |");
                System.out.println("|----------------------------------------|");
                System.out.println("| 1. Ver tabla     |  2. Cerrar programa |");
                System.out.println("==========================================");
                System.out.println("Seleccione una opcion:");
                menu = sc.nextInt();
                if (menu != 2) { // Condicional verdadera según la opción seleccionada en el menu principal.
                    menu = 0; // Se restablece la variable menu para poder continuar y cerrar más adelante el
                              // programa
                    do { // Bucle do-while infinito para repetir el paso en caso de no cumplir la
                         // condición.
                        if (menu != 0) { // Condición que nos permitirá romper los bucles y cerrar el programa.
                            break;
                        } else { // Lado falso de la condición que nos permite continuar con el proceso.
                            System.out.println("==========================================");
                            System.out.println("| ¿Cual es el numero que deseas conocer? |");
                            System.out.println("==========================================");
                            System.out.println("Ingresa un valor:");
                            numero = sc.nextInt();
                            if (numero > 0) { // Lado verdadero de la condición según el valor ingresado.
                                do { // Bucle do-while infinito para repetir el paso en caso de no cumplir la
                                     // condición.
                                    if (menu != 0) { // Lado verdadero de la condición que nos permitirá romper los
                                                     // bucles y cerrar el programa.
                                        break;
                                    } else { // Lado falso de la condición que nos permite continuar con el proceso.
                                        System.out.println("==========================================");
                                        System.out.println("| ¿Cuantos multiplos deseas conocer?     |");
                                        System.out.println("==========================================");
                                        System.out.println("Ingresa un valor:");
                                        multiplos = sc.nextInt();
                                        if (multiplos > 0) { // Lado verdadero de la condicion que hace la operación
                                                             // final.
                                            System.out.println("==========================================");
                                            System.out
                                                    .println("Estos son los " + multiplos + " multiplos de "
                                                            + numero);
                                            System.out.println("==========================================");
                                            for (int i = 1; i <= multiplos; i++) { // Bucle for que realiaza la
                                                                                   // operación final y lo muestra en
                                                                                   // pantalla.
                                                System.out
                                                        .println("- " + numero + " x " + i + " = " + (numero * i));
                                            }
                                            System.out.println("==========================================");
                                            System.out.println("| 1. Volver al menu | 2. Cerrar programa |");
                                            System.out.println("==========================================");
                                            System.out.println("Ingrese una opcion: ");
                                            menu = sc.nextInt(); // Opción final que nos deja volver al menú principal o
                                                                 // cerrar el programa directamente.
                                        } else { // Lado falso de la condicion que hace la operación final.
                                            System.out.println("==========================================");
                                            System.out.println("| las numero debe ser mayor a 0           |");
                                            System.out.println("==========================================");
                                        }
                                    }
                                } while (true);
                            } else { // Lado falso de la condición según el valor ingresado.
                                System.out.println("==========================================");
                                System.out.println("| El numero debe ser mayor a 0           |");
                                System.out.println("==========================================");
                            }
                        }
                    } while (true);
                }
            }
        } while (true);
    }
}