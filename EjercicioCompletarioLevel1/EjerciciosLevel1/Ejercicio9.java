package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]arg){
        Scanner analisText = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = analisText.nextLine();
        System.out.println("¿Que caracter desea encontrar en el texto previamente ingresado?: ");
        String encontrarText = analisText.nextLine();
        System.out.println("La cantidad de"+ " '" + encontrarText + "'"+ " presentes en la palabra ingresada es de:");
        System.out.println(texto.split(encontrarText, -1).length-1);
    }
}