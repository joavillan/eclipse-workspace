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
		 * Mi intención era hacer la raiz cuadrada del total (truncada) de forma que fuese
		 * dando el mayor posible en cada formación.
		 * ej: 35 raíz 5, quedan 10,  raíz de 10 3, queda 1
		 * Así podría construir el número de matrices más óptimo.
		 * Despúes bastaría con recorrer la matriz con un metodo que determinase el numero de escudos
		 * que dependería de la longitud del array. Por ejemplo con 5 posición 0=3 escudos 
		 * posición  1 a 3 = 2 escudos y posición 4 = 3 escudos. Se haría el método de forma 
		 * decreciente de forma que cada ciclo disminuyese en uno y tereminando que una vez que se hace
		 * el exterior (4 bucles "for") el resto solo equivaldrían a un solo escudo
		 */
	}
}
