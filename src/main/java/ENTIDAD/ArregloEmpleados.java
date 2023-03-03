package ENTIDAD;

import SERVICIOS.ClaseEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class ArregloEmpleados {

    private ArrayList <ClaseEmpleados> Personal;
    public ArregloEmpleados() {Personal = new ArrayList<>(); }

    Scanner Sc = new Scanner(System.in);

    public void agregarEmpleado() {
        System.out.println("Digite el ID del empleado");
        String id = Sc.next();

        System.out.println("Digite el Nombre del empleado");
        String nom = Sc.next();

        System.out.println("Digite el Apellido del empleado");
        String ap = Sc.next();

        System.out.println("Digite la Ocupacion del empleado");
        String oc = Sc.next();

        System.out.println("Digite el Modulo del empleado");
        String mod = Sc.next();

        ClaseEmpleados nuevo = new ClaseEmpleados(id, nom, ap, oc, mod);
        Personal.add(nuevo);

    }

    public void buscarEmpleado() {
        System.out.println("Digite el id del empleado que desea consultar");
        String id = Sc.next();
        for (int i = 0; i < Personal.size(); i++){
            if (id == Personal.get(i).getID()){
                System.out.println(Personal.get(i).getNombre() + Personal.get(i).getApellido());
                System.out.println("empleado encontrado");
            }
        }
    }

    public void eliminarEmpleado() {
        System.out.println("Digite el id del empleado que desea eliminar");
        String id = Sc.next();
        for (int i = 0; i < Personal.size(); i++) {
            if (id == Personal.get(i).getID()) {
                Personal.remove(i);
                System.out.println("Empleado eliminado");
            }else {
                System.out.println("Empleado eliminado");
            }
        }
    }

}
