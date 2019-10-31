package ej9;

import java.io.IOException;

import utiles.Libreria;

public class Capicua {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();

		int entero = a1.excepcionint();
		String cadena = Integer.toString(entero);
		String cadenainvertida = "";
		
		if (cadena.length()>1) {
			for (int i = cadena.length()-1; i>=0; i--) {
				cadenainvertida+=cadena.charAt(i);
			}
			int enteroinvertido = Integer.parseInt(cadenainvertida);
			if (entero==enteroinvertido) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}else {
			System.out.println("No es capicua");
		}
	}
}
