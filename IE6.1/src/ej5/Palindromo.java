package ej5;

import java.io.IOException;

import utiles.Libreria;

public class Palindromo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();
		System.out.print("Introduce la cadena: ");
		
		String cadena = a1.excepcionstring();
		String cadenainvertida = "";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenainvertida += cadena.charAt(i);
		}
		System.out.println("Cadena invertida: "+cadenainvertida);
		
		cadena=cadena.replaceAll(" ", "");
		int ini=0;
		int des = cadena.length()-1;
		boolean bError = false;
		
		while ((ini<des) && (!bError)){
			
			if (cadena.charAt(ini)==cadena.charAt(des)){				
				ini++;
				des--;
			} else {
				bError = true;
			}		
		}
		
		if (!bError) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo");
		}
	}

}
