package ENTIDAD;

import SERVICIOS.ClaseMantenimiento;

import java.util.ArrayList;
import java.util.Scanner;

public class ArregloServicio {

    private ArrayList<ClaseMantenimiento> servicio;

    public ArregloServicio() { servicio = new ArrayList<>(); }

    Scanner Op = new Scanner(System.in);

    public void agregarServicio() {
        System.out.println("digite el cilindraje de la motocicleta");
        String Cld = Op.next();

        System.out.println("digite el serial del motor");
        String Ref_motor = Op.next();

        System.out.println("digite el numero del chasis");
        String Ref_chasis = Op.next();

        System.out.println("digite la marca y el espesor del aceite");
        String Aceite = Op.next();

        System.out.println("digite el km correspondiente para el proximo servicio");
        String Prox_servicio = Op.next();

        ClaseMantenimiento nuevo = new ClaseMantenimiento(Cld, Ref_motor, Ref_chasis, Aceite, Prox_servicio);
        servicio.add(nuevo);

        }
    public void buscarServicio() {
        System.out.println("AVISO: RECUERDE QUE ESTA BUSQUEDA SOLO ARROJARA RESULTADOS CORRESPONDIENTES A DATOS DE SERVICIO CORRESPONDIENTES A LA MOTOCICLETA. Ingrese el numero de motor que desea consultar");
        String Ref_motor = Op.next();
        for (int i = 0; i < servicio.size(); i++){
            if(Ref_motor == servicio.get(i).getReferencia_motor()){
                System.out.println(servicio.get(i).getCilindraje());
                System.out.println(servicio.get(i).getAceite());
                System.out.println("Moto En Servicio Encontrada");
            }
        }
    }

    public void eliminarServicio() {

        System.out.println("Digite la refencia del motor del servicio el cual desea eliminar");
        String Ref_motor = Op.next();
        for (int i = 0; i < servicio.size(); i++){
            if(Ref_motor == servicio.get(i).getReferencia_motor()){
                servicio.remove(i);
                System.out.println("Servicio Borrado");
            } else {
                System.out.println("Servicio Desconocido");
            }
        }
    }


}
