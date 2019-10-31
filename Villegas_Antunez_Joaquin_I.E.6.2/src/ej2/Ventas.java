package ej2;

import java.io.IOException; 

import utiles.Libreria;

public class Ventas {

	public static void menu() throws IOException {
		Libreria a1 = new Libreria();
		
		System.out.println("1. Rellenar ventas de coches mensuales.\r\n" + 
				"2. Mostrar las ventas.\r\n" + 
				"3. Mostrar las ventas al revés.\r\n" + 
				"4. Total de ventas en el año.\r\n" + 
				"5. Ventas totales meses pares.\r\n" + 
				"6. Mes con más ventas.\r\n" + 
				"7. Ventas de mayor a menor.\r\n" + 
				"8. Salir del programa.");
		int array[] = new int [12];
		int arrayaux[] = new int [12];
		String meses[] = new String [] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		
		int n1 = 0;
		do {
			switch (n1 = a1.excepcionint()) {
			case 1:
				for (int i = 0; i < array.length; i++) {
					array[i]=(int) (Math.random() * (100 - 10) + 10);
					arrayaux[i]=array[i];
				}
				break;
			case 2:
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]+" ");
				}
				System.out.println("");
				break;
			case 3:
				for (int i = array.length-1; i > 0; i--) {
					System.out.print(array[i]+" ");
				}
				System.out.println("");
				break;
			case 4:
				int temp = 0;
				int total = 0;
				for (int i = 0; i < array.length; i++) {
					total=temp+array[i];
					temp=total;
				}
				System.out.println(total);
				break;
			case 5:
				int contador = 0;
				temp = 0;
				total = 0;
				for (int i = 0; i < array.length; i++) {
					contador++;
					if (contador%2==0) {
						total=temp+array[i];
						temp=total;
					}
				}
				System.out.println(total);
				break;
			case 6:
				temp = 0;
				String mes = null;
				for (int i = 0; i < array.length; i++) {
					if (array[i]>temp) {
						temp=array[i];
						mes = meses[i];
					}
				}
				System.out.println(mes);
				break;
			case 7:
				a1.metodoburbuja(arrayaux);
				for (int i = array.length-1; i > 0; i--) {
					System.out.print(arrayaux[i]+" ");
				}
				System.out.println("");
				break;
			case 8:
				break;

			default:
				System.out.println("Opción inválida");;
			}
		} while (n1 != 8);
	}
}
