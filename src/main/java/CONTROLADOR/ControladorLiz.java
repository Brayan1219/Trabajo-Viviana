package CONTROLADOR;

import ENTIDAD.ArregloServicio;
import ENTIDAD.Arreglomenu;
import SERVICIOS.ClaseMantenimiento;
import SERVICIOS.Clasemenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorLiz {
    private ArrayList<ClaseMantenimiento> menudos;

    public ControladorLiz() {
        menudos = new ArrayList<>();
    }
    public static void main() {
        ArregloServicio servicio=new ArregloServicio();
        Scanner pedir = new Scanner(System.in);

        while (true) {

            System.out.println("1-Agregar Servicio");
            System.out.println("2-buscar Servicio");
            System.out.println("3-eliminar Servicio");


            int cual = pedir.nextInt();

            if (cual == 1) {
                servicio.agregarServicio();

            }
            if (cual == 2) {
                servicio.buscarServicio();

            }
            if (cual == 3) {
                servicio.eliminarServicio();

            }


        }
    }
}
