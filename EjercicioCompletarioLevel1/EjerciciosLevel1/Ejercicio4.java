package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = num.nextInt();
        int numero1 = 1;
            for(int i = 2; i <= numero; i++){
               numero1 = numero1 * i;
                
                
            }
            System.out.println("El factorial de "+ numero + " es "+ numero1);
            num.close();
    }
}
