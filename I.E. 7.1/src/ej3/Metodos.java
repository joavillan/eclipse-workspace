package ej3;

import java.io.IOException;
import java.util.ArrayList;

import utiles.Libreria;

public class Metodos {
	
	public void ejecutar() throws IOException {
		Libreria a1 = new Libreria();
		
		int key = 0;

		ArrayList<Persona> u = new ArrayList<Persona>();
		
		u.add(new Profesor("Pepe", "Gutierrez", "23882482H", new Direccion("Malaga", "Sevilla", 41350, "España"), "Despacho 1"));
		u.add(new Estudiante("Luis", "Pérez", "23864482H", new Direccion("Huesca", "Córdoba", 41620, "España"), 123456));
		
		do {
			System.out.println("1-Ver personas \n 2-Ver Profesores \n 3-VerEstudiantes \n 4-Salir");
			key = a1.excepcionintcontexto("Introduce la opción a realizar");
			
			switch (key) {
			case 1:
				System.out.println(u);
				break;
			case 2:
				for (Persona persona : u) {
					if (persona instanceof Profesor) {
						((Profesor)persona).identificarse();
					}
				}
				break;
			case 3:
				for (Persona persona : u) {
					if (persona instanceof Estudiante) {
						((Estudiante)persona).identificarse();
					}
				}
				break;
			case 4:
				break;
			default:
				System.out.println("ERROR. Introduce un valor válido");
				break;
			}
		} while (key != 4);
	}

}
