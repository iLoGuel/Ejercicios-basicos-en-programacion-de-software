
/* Una tienda de regalo desea registrar sus ventas por medio de una computadora, para esto se requiere que lea por cada cliente */
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int opcion, valor, pago;
        var caja = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=======================================");
            System.out.println("Bienvenido, ¿que accion desea realizar?");
            System.out.println("---------------------------------------");
            System.out.println("1. Registrar Compra | 2. Mostrar Caja");
            System.out.println("         0. Cerrar Programa");
            System.out.println("=======================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("=======================================");
                    System.out.println("Registre el valor de la compra:");
                    System.out.println("=======================================");
                    valor = sc.nextInt();
                    System.out.println("=======================================");
                    System.out.println("Registre el valor de pago:");
                    System.out.println("=======================================");
                    pago = sc.nextInt();
                    var iva = (((valor * 119) / 100) - valor);
                    var total_pagar = iva + valor;
                    System.out.println("=======================================");
                    System.out.println("Recibo de compra");
                    System.out.println("---------------------------------------"); 
                    System.out.println("Valor de compra:" + valor);
                    System.out.println("IVA:" + iva);
                    System.out.println("Total a pagar:" + total_pagar);
                    System.out.println("Pago:" + pago);
                    System.out.println("Devolucion:" + (pago - (iva + valor)));
                    System.out.println("=======================================");
                    caja += total_pagar;
                    break;
                case 2:
                    System.out.println("=======================================");
                    System.out.println("El total registrado en la caja es de:");
                    System.out.println("---------------------------------------");
                    System.out.println("$" + caja);
                    System.out.println("=======================================");
                    break;
            }
        } while (opcion != 0);
    }
}
