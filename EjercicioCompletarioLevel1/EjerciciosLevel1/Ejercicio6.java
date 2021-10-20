package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado = 1;
        int i;
	
        System.out.print("Introduce el primer número:");			
        numero1 = lectura.nextInt();
                    
        System.out.print("Introduce el segundo número:");
        numero2 = lectura.nextInt();

        for (i=1; i<=numero2; i++) {
            resultado= resultado*numero1;
            System.out.println();
            lectura.close();
        }
        System.out.println( numero1 + " elevado a la " + numero2 + " = " + resultado);

       
    }
    
}