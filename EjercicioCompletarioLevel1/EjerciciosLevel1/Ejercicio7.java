package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    static String minAMayuscula(String caracter){
        String result = "";
        char texto = ' ';
        for (int i = 0; i < caracter.length(); i++) {
            if(caracter.charAt(i)>='a'&& caracter.charAt(i) <= 'z'){
                texto = (char)(caracter.charAt(i) - 32);
            }
            else{
                texto = (char)(caracter.charAt(i));
            }
            result += texto;
        }
        return result;
    }
    public static void main(String[] args){
        String mayuscula;
        Scanner text = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minuscula: ");
        mayuscula = text.nextLine();
        System.out.println(minAMayuscula(mayuscula));
        text.close();
    }

}