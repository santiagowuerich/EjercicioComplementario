package EjerciciosLevel2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner func= new Scanner (System.in);
        int numero1;
        int numero2;
        System.out.println("\n" + "Ingrese desde que numero quiere analizar");
        numero1= func.nextInt();
        System.out.println("\n" + "Ingrese hasta que numero quiere analizar");
        numero2= func.nextInt();
        func.close();
        //public static void (int numero1, int numero2){
            ArrayList<String> numeros = new ArrayList<>();
            for (int i= numero1; i < numero2; i++){
                if (i % 2 == 0 && numero2 % 3 == 0){
                    numeros.add("FizzBuzz");}
                else if (i % 2 == 0) {
                    numeros.add("Fizz");}
                else if (i % 3 == 0) {
                    numeros.add("Buzz"); }
                else {
                    numeros.add(String.valueOf(i));}
            }
          for (int i=0; i< numeros.size(); i++)
            System.out.print(numeros.get(i) + " ");
        }
    }