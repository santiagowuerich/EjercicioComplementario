package EjerciciosLevel2;
import java.util.ArrayList;

import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Ejercicio3 {
    public static void main(String[] args){
        
        ArrayList<String> barajaFrancesa = new ArrayList<String>();
        barajaFrancesa.add("1 de corazones");
        barajaFrancesa.add("2 de corazones");
        barajaFrancesa.add("3 de corazones");
        barajaFrancesa.add("4 de corazones");
        barajaFrancesa.add("5 de corazones");   
        barajaFrancesa.add("6 de corazones");
        barajaFrancesa.add("7 de corazones");
        barajaFrancesa.add("8 de corazones");
        barajaFrancesa.add("9 de corazones");
        barajaFrancesa.add("10 de corazones");
        barajaFrancesa.add("11 de corazones");
        barajaFrancesa.add("12 de corazones");
        barajaFrancesa.add("13 de corazones");
        barajaFrancesa.add("1 de diamantes");
        barajaFrancesa.add("2 de diamantes");
        barajaFrancesa.add("3 de diamantes");
        barajaFrancesa.add("4 de diamantes");
        barajaFrancesa.add("5 de diamantes");
        barajaFrancesa.add("6 de diamantes");
        barajaFrancesa.add("7 de diamantes");
        barajaFrancesa.add("8 de diamantes");
        barajaFrancesa.add("9 de diamantes");
        barajaFrancesa.add("10 de diamantes");
        barajaFrancesa.add("11 de diamantes");
        barajaFrancesa.add("12 de diamantes");
        barajaFrancesa.add("13 de diamantes");
        barajaFrancesa.add("1 de trebol");
        barajaFrancesa.add("2 de trebol");
        barajaFrancesa.add("3 de trebol");
        barajaFrancesa.add("4 de trebol");
        barajaFrancesa.add("5 de trebol");
        barajaFrancesa.add("6 de trebol");
        barajaFrancesa.add("7 de trebol");
        barajaFrancesa.add("8 de trebol");
        barajaFrancesa.add("9 de trebol");
        barajaFrancesa.add("10 de trebol");
        barajaFrancesa.add("11 de trebol");
        barajaFrancesa.add("12 de trebol");
        barajaFrancesa.add("13 de trebol");
        barajaFrancesa.add("1 de picas");
        barajaFrancesa.add("2 de picas");
        barajaFrancesa.add("3 de picas");
        barajaFrancesa.add("4 de picas");
        barajaFrancesa.add("5 de picas");
        barajaFrancesa.add("6 de picas");
        barajaFrancesa.add("7 de picas");
        barajaFrancesa.add("8 de picas");
        barajaFrancesa.add("9 de picas");
        barajaFrancesa.add("10 de picas");
        barajaFrancesa.add("11 de picas");
        barajaFrancesa.add("12 de picas");
        barajaFrancesa.add("13 de picas");

    System.out.println("Los elementos de la baraja ordenada son: " + "\n");
        for(int i = 0; i < barajaFrancesa.size(); i++) 
            System.out.print(barajaFrancesa.get(i) + " - ");

    System.out.println("\n" + "\n" + "Los elementos de la baraja en reverso son: " + "\n");
        for(int i = barajaFrancesa.size() - 1; i >= 0 ; i--) 
             System.out.print(barajaFrancesa.get(i) + " - ");
    
    

    Collections.shuffle(barajaFrancesa);
    Set<String> mezcla = new LinkedHashSet<String>();
    mezcla.addAll(barajaFrancesa);

    System.out.println("\n" + "\n" + "Los elementos de la baraja desordenada son: " + "\n");
        for(int i = 0; i < mezcla.size(); i++) 
            System.out.print(barajaFrancesa.get(i) + " - ");  
    }
}