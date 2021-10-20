package EjerciciosLevel1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args ){
        Scanner numeros = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = numeros.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = numeros.nextInt();

        System.out.println("El resultado de la suma es: " + (a + b));
        System.out.println("El resultado de la resta es: " + (a - b));
        System.out.println("El resultado de la multiplicacion es: " + (a * b));
        System.out.println("El resultado de la division es: " + (a / b));
        System.out.println("El modulo es: " + (a % b));

        numeros.close();
    }
}
