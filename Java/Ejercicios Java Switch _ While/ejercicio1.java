import java.util.Scanner;
public class CiclosClass {
    public static void main(String[]args){
        String x;
        Scanner sc = new Scanner (System.in);
        System.out.println("============================");
        System.out.println("Inrgese el día de la semana");
        System.out.println("============================");
        System.out.println("Lunes     || Viernes");
        System.out.println("Martes    || Sabado");
        System.out.println("miercoles || Domingo");
        System.out.println("Jueves    || ");
        System.out.println("============================");
        x= sc.nextLine();
        
        switch(x){
            case "Lunes", "lunes", "LUNES":
                System.out.println("============================");
                System.out.println("Es un día laboral");
                System.out.println("============================");
                break;
            case "Martes", "martes", "MARTES":
                System.out.println("============================");
                System.out.println("Es un día laboral");
                System.out.println("============================");
                break;
            case "Miercoles", "miercoles", "MIERCOLES":
                System.out.println("============================");
                System.out.println("Es un día laboral");
                System.out.println("============================");
                break;
            case "Jueves", "jueves", "JUEVES":
                System.out.println("============================");
                System.out.println("Es un día laboral");
                System.out.println("============================");
                break;
            case "Viernes", "viernes", "VIERNES":
                System.out.println("============================");
                System.out.println("Es un día laboral");
                System.out.println("============================");
                break;
            case "Sabado", "sabado", "SABADO":
                System.out.println("============================");
                System.out.println("Es un día laboral");
                System.out.println("============================");
                break;
            case "Domingo", "domingo", "DOMINGO":
                System.out.println("============================");
                System.out.println("El día de hoy es Domingo y no es un día laboral");
                System.out.println("============================");
                break;
        }
    }
}
