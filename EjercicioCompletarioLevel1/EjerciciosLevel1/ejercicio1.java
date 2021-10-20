package EjerciciosLevel1;


import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        
        String a = scan.nextLine();

        System.out.println("Hola " + a);
       
        scan.close();
    }
}   