package EjerciciosLevel1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner secuencia = new Scanner(System.in);	
        System.out.println("Introduce un número:");			
        int numero = secuencia.nextInt();

            for(int i = 0; i < numero; i++) {
                for (int j = 1; j< i+2; j++) {
                    System.out.print(j+ " ");
                }
                System.out.println();    
            }   secuencia.close(); 
    } 
    
}