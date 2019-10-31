package ej3;

import java.io.IOException;

import utiles.Libreria;

public class LegionariosyEscudos {
	
	public static void legion() throws IOException {
		Libreria a1 = new Libreria();
		int n1 = a1.excepcionint();
		int value = 0;
		int i = 0;
		
		do {
			for (i = 0; i < n1; i++) {
				value = i*i;
				if (value == n1) {
					break;
				} else if (value > n1) {
					i--;
					break;
				}
			}
		} while (n1-value!=0);
		
		System.out.println(i);
		
		/**
		 * Mi intenci�n era hacer la raiz cuadrada del total (truncada) de forma que fuese
		 * dando el mayor posible en cada formaci�n.
		 * ej: 35 ra�z 5, quedan 10,  ra�z de 10 3, queda 1
		 * As� podr�a construir el n�mero de matrices m�s �ptimo.
		 * Desp�es bastar�a con recorrer la matriz con un metodo que determinase el numero de escudos
		 * que depender�a de la longitud del array. Por ejemplo con 5 posici�n 0=3 escudos 
		 * posici�n  1 a 3 = 2 escudos y posici�n 4 = 3 escudos. Se har�a el m�todo de forma 
		 * decreciente de forma que cada ciclo disminuyese en uno y tereminando que una vez que se hace
		 * el exterior (4 bucles "for") el resto solo equivaldr�an a un solo escudo
		 */
	}
}
