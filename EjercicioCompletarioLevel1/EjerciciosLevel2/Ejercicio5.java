package EjerciciosLevel2;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horas_trabajadas = new ArrayList<>();
        List<Integer> valor_por_hora = new ArrayList<>();
      
        List<Integer> totales = new ArrayList<>();
        horas_trabajadas.add(8);
        horas_trabajadas.add(10);
        horas_trabajadas.add(6);
        horas_trabajadas.add(4);
        horas_trabajadas.add(9);

        valor_por_hora.add(250);
        valor_por_hora.add(400);
        valor_por_hora.add(550);
        valor_por_hora.add(54);
        valor_por_hora.add(90);

        for(int i = 0; i < horas_trabajadas.size(); i++)
            totales.add( horas_trabajadas.get(i) * valor_por_hora.get(i));

            System.out.println("Remuneracion por dia de lunes a viernes: ");
        for (int i=0; i < totales.size(); i++)
            System.out.print(totales.get(i) + ", ");
        int total=0;
        for (int i=0; i< totales.size(); i++){
           total+= totales.get(i);
            
        }
        System.out.println("\n" + "Total pagado por semana trabajado $" + total);
}
}