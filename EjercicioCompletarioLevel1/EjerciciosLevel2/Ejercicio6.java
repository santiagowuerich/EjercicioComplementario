package EjerciciosLevel2;

import java.util.*;

public class Ejercicio6 {


    public static void main(String[] args) {

        HashSet<Empleados> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Empleados("Analia Sanchez", 21567986, 6, 345));
        empleado.add(new Empleados("Rosario Martines", 91472486, 9, 345));
        empleado.add(new Empleados("Tomas Acuna", 35436447, 3, 500));
        empleado.add(new Empleados("Rodrigo Campos", 87856758, 10, 167));

        for (Empleados lista : empleado) {
            System.out.println("\n" + lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horas_trabajadas + " - Valor por hora: " + lista.valor_por_hora);
        }

        for (Empleados crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nRemuneracion percibida:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Sueldo: " + valor));
    }
}
class Empleados {
    String nombre;
    int dni;
    float horas_trabajadas;
    float valor_por_hora;


    public Empleados(String nombre, int dni, float horas_trabajadas, float valor_por_hora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horas_trabajadas = horas_trabajadas;
        this.valor_por_hora = valor_por_hora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horas_trabajadas * this.valor_por_hora;
    }
}