package CONTROLADOR;

import ENTIDAD.ArregloEmpleados;
import ENTIDAD.Arreglomenu;
import SERVICIOS.ClaseEmpleados;
import SERVICIOS.Clasemenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorStiven {

    private ArrayList<ClaseEmpleados> menutres;

    public ControladorStiven() {
        menutres= new ArrayList<>();
    }
    public static void main() {
        ArregloEmpleados Personal =new ArregloEmpleados();
        Scanner pedir = new Scanner(System.in);

        while (true) {

            System.out.println("1-Agregar Elemento");
            System.out.println("2-buscar Elemento");
            System.out.println("3-eliminar moto");


            int cual = pedir.nextInt();

            if (cual == 1) {
                Personal.agregarEmpleado();

            }
            if (cual == 2) {
                Personal.buscarEmpleado();

            }
            if (cual == 3) {
                Personal.eliminarEmpleado();

            }


        }
    }
}
