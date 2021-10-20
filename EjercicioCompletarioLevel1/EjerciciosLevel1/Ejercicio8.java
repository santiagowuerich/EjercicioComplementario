package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args ){
        Scanner Dato = new Scanner(System.in);
        System.out.print("Ingrese Nombre y Apellido: ");
        String nom = Dato.nextLine();
        System.out.print("Ingrese Edad: ");
        String ed = Dato.nextLine();
        System.out.print("Ingrese Direccion: ");
        String dir = Dato.nextLine();
        System.out.print("Ingrese Ciudad: ");
        String ciu = Dato.nextLine();

        System.out.println(ciu + " - " + dir + " - " + ed + " - " + nom);
        Dato.close();
    }
}
