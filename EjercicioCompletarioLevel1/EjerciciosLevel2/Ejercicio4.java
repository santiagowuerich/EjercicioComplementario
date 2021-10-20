package EjerciciosLevel2;
import java.util.*;
  

  
public class Ejercicio4 {
    public static void main(String[] argv)
        throws Exception
    { 
        try {
            ArrayList<String>
                alumnos = new ArrayList<String>();
  

            alumnos.add("santiago");
            alumnos.add("lucas");
            alumnos.add("selena");
            alumnos.add("maria");
            alumnos.add("eduardo");
            alumnos.add("luciana");
            alumnos.add("denise");
            alumnos.add("carlos");
            alumnos.add("leticia");
            alumnos.add("merida");
            alumnos.add("lebron");
            alumnos.add("james");
            
  

            System.out.println("Lista Original: "
                               + alumnos);
  

            List<String> arrlist1 = alumnos.subList(0, 4);
  

            System.out.println("Lista 1: "
                               + arrlist1);
            List<String> arrlist2 = alumnos.subList(4, 8);
  

            System.out.println("Lista 2: "
                               + arrlist2);
             List<String> arrlist3 = alumnos.subList(8, 12);
  

            System.out.println("Lista 3: "
                               + arrlist3);
                               
        }
  
        catch (IndexOutOfBoundsException e) {
            System.out.println("Excepcion : " + e);
        }
  

    }
}