package ENTIDAD;

import SERVICIOS.Clasemenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Arreglomenu {
    private ArrayList<Clasemenu> motos;

    public Arreglomenu() {
        motos = new ArrayList<>();
    }

    Scanner Br = new Scanner(System.in);

    public void agregarMotos() {
        System.out.println("cual es el serial de la moto?");
        int serial = Br.nextInt();

        System.out.println("cual es la marca de la moto?");
        String marca = Br.next();

        System.out.println("cual es el modelo de la moto");
        int modelo = Br.nextInt();

        System.out.println("cual es la placa de la moto");
        String placa = Br.next();

        System.out.println("cual es el color de la moto");
        String color = Br.next();

        Clasemenu nuevo = new Clasemenu(serial, marca, modelo, placa, color);
        motos.add(nuevo);
    }
    public void buscarMotos() {
        System.out.println("cual es el  serial que desea buscar");
        int serial = Br.nextInt();
        for (int i = 0; i < motos.size(); i++) {
            if (serial == motos.get(i).getSerial()) {
                System.out.println(motos.get(i).getMarca());
                System.out.println("encontrado");
            }
        }
    }

    public void eliminarMotos() {

        System.out.println("Que serial desea borrar");
        int serial = Br.nextInt();

        for (int i = 0; i < motos.size(); i++) {
            if (serial == motos.get(i).getSerial()) {
                motos.remove(i);
                System.out.println("elemento borrado");
            } else {
                System.out.println("elemento no encontrado");
            }
        }
    }

        public void imprimirMotos() {
        for (int i = 0; i < motos.size(); i++) {
            System.out.println("el serial es " + motos.get(i).getSerial());
            System.out.println("la marca es " + motos.get(i).getMarca());
            System.out.println("el modelo es " + motos.get(i).getModelo());
            System.out.println("la placa es " + motos.get(i).getPlaca());
            System.out.println("el color es " + motos.get(i).getColor());
        }
    }

    public void borrarTodo() {
        System.out.println("seguro quiere borrar todos los elementos");
        String seguro = Br.next();
        if ("si".equals(seguro) || "SI".equals(seguro)) {
            motos.clear();
            System.out.println("se han borrado todos los elementos");
        } else {
            System.out.println("okey no has borrado nada ");
        }

    }

    public void cantidadMotos() {
        System.out.println("Hay " + motos.size() + " motos guardadas");
    }

}
