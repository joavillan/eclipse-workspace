package ej4;

import java.util.ArrayList;

public interface Metodos {
	
	public default int publicacionesAnterioresA(ArrayList<Biblioteca> b, int año) {
		int contador = 0;
		for (Biblioteca biblioteca : b) {
			if (biblioteca.getAño()<año) {
				contador++;
			}
		}
		
		return contador;
	}

}
