package ej4;

import java.util.ArrayList;

public class Ejecucion {

	public void ejecutar() {
		ArrayList<Biblioteca> b = new ArrayList<Biblioteca>();
		
		b.add(new Libros(1234, "Atlas", 1989, false));
		b.add(new Libros(1235, "Odisea", 2003, false));
		b.add(new Libros(1236, "Title", 1870, false));
		b.add(new Libros(1237, "Asylum", 2007, false));
		b.add(new Revistas(2345, "Hola", 2003, 5));
		b.add(new Revistas(2346, "Bye", 2005, 7));
		b.add(new Revistas(2347, "Go", 2008, 20));
		
		for (Biblioteca biblioteca : b) {
			if (biblioteca instanceof Libros) {
				if (biblioteca.getCodigo() == 1234) {
					((Libros) biblioteca).prestar();
				}
			}
		}
		
		System.out.println(b);
		
		int x = 0;
		for (Biblioteca biblioteca : b) {
			if (biblioteca instanceof Libros) {
				x = ((Libros) biblioteca).cuentaPrestados(b);
			}
		}
		System.out.println("Número de libros prestados: "+x);
		
		int a = 0;
		for (Biblioteca biblioteca : b) {
			if (biblioteca instanceof Libros) {
				a = ((Libros)biblioteca).publicacionesAnterioresA(b, 1990);
			}
		}
		System.out.println("Número de publicacoiones anteriores a 1990: " + a);
	}
}
