package ej4;

import java.util.ArrayList;

public interface Metodos {
	
	public default int publicacionesAnterioresA(ArrayList<Biblioteca> b, int a�o) {
		int contador = 0;
		for (Biblioteca biblioteca : b) {
			if (biblioteca.getA�o()<a�o) {
				contador++;
			}
		}
		
		return contador;
	}

}
