package ej4;

import java.io.IOException;

import utiles.Libreria;

public class Invertircadena {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1= new Libreria();

		System.out.print("Introduce la cadena con la que vas a trabajar: ");
		String cadena = a1.excepcionstring();
		String cadenainvertida = "";
		
		System.out.println(cadena);
		
		for (int i = cadena.length()-1; i>=0; i--) {
			cadenainvertida+=cadena.charAt(i);
		}
		
		System.out.println(cadenainvertida);
		
		int contadora = 0,contadore = 0,contadoro = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i)=='a') {
				contadora++;
				if (contadora>10) {
					System.out.println("Exceso de a");
					break;
				}
			}
			if (cadena.charAt(i)=='o') {
				contadoro++;
				if (contadoro>5) {
					System.out.println("Exceso de o");
					break;
				}
			}
			if (cadena.charAt(i)=='e') {
				contadore++;
				if (contadore>3) {
					System.out.println("Exceso de e");
					break;
				}
			}
		}
		
		System.out.print("Introduce la palabra que quieras buscar en la cadena: ");
		String find = a1.excepcionstring();
		int intIndex = find.indexOf(cadena);
		if(intIndex == - 1){
            System.out.println("palabra encontrada");
         }else{
            System.out.println("palabra no encontrada"+ intIndex);
         }
		
	}

}
