package EjerciciosLevel2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner Num= new Scanner (System.in);
        int num1;
        int num2;

        ArrayList<Integer> arrEnteros = new ArrayList<Integer>();
        arrEnteros.add(1);
        arrEnteros.add(2);
        arrEnteros.add(3);
        arrEnteros.add(4);
        arrEnteros.add(5);
        System.out.println("Los elementos del arreglo son: ");
        for(int i = 0; i < arrEnteros.size(); i++) 
            System.out.print(arrEnteros.get(i) + "; ");
            System.out.println("\n" + "\n" + "La cantidad de elementos del arreglo es de: " + arrEnteros.size());
        System.out.print("\n" + "Ingrese un numero que quisiera agregar al principio del arreglo: ");
        num1= Num.nextInt();
        arrEnteros.add(0, num1);
        System.out.print("Ingrese un numero que quisiera agregar al final del arreglo: ");
        num2= Num.nextInt();
        arrEnteros.add(num2);
        System.out.println("Ahora los elementos del arreglo son: ");
        for(int i = 0; i < arrEnteros.size(); i++) 
        System.out.print(arrEnteros.get(i) + "; ");
        System.out.println("\n"+ "\n" + "La nueva cantidad de elementos del arreglo es de " + arrEnteros.size());
  
        }
    }
