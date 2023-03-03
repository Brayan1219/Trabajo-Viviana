package CONTROLADOR;

import ENTIDAD.Arreglomenu;
import SERVICIOS.Clasemenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorBrayan {

    private ArrayList<Clasemenu> menuuno;

    public ControladorBrayan() {
        menuuno = new ArrayList<>();
    }
    public static void main() {
        Arreglomenu motos=new Arreglomenu();
        Scanner pedir = new Scanner(System.in);

        while (true) {

            System.out.println("1-Agregar Elemento");
            System.out.println("2-buscar Elemento");
            System.out.println("3-eliminar moto");


            int cual = pedir.nextInt();

            if (cual == 1) {
                motos.agregarMotos();

            }
            if (cual == 2) {
                motos.buscarMotos();

            }
            if (cual == 3) {
                motos.eliminarMotos();

            }


        }
    }

}

