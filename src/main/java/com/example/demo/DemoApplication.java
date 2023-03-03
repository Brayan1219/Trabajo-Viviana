package com.example.demo;

import CONTROLADOR.ControladorBrayan;
import CONTROLADOR.ControladorLiz;
import CONTROLADOR.ControladorStiven;
import ENTIDAD.Arreglomenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Arreglomenu motos=new Arreglomenu();
		Scanner pedir = new Scanner(System.in);

		while (true) {

			System.out.println("1-ACCEDER AL MODULO MOTOS");
			System.out.println("2-ACCEDER AL MODULO SERVICIO");
			System.out.println("2-ACCEDER AL MODULO EMPLEADOS");

			int cual = pedir.nextInt();

			if (cual == 1) {
				ControladorBrayan.main();

			}
			if (cual == 2) { 
				ControladorLiz.main();

			}
			if (cual == 3) {
				ControladorStiven.main();

			}


		}
	}

}
