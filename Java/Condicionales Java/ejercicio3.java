/* Un programa que simule un inicio de sesion solicitando el nombre de usuario y la contrasena y mostrar un mensaje en pantalla, inicio de sesion correcto, nombre de usuario de sesion. */
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        String usuario, contrasena;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema de login");
        System.out.println("por favor ingrese sus datos");
        System.out.println("Ingrese su nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.println("Ingrese su contrasena: ");
        contrasena = sc.nextLine();
        if (usuario.equals("root") && contrasena.equals("admin123")) {
            System.out.println("Bienvenido "+usuario+" a tu portal. :D");
        }
        else {
            System.out.println("Lo setimos, no te encuentras registrado en el portal.");
        }
    }
}