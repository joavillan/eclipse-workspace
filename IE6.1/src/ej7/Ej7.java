package ej7;

import java.util.StringTokenizer;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Juan Carlos \n 8.5 \n Andr�s \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		StringTokenizer tokens=new StringTokenizer(cadena, "\n");
		int contador=0;
		
		while (tokens.hasMoreTokens()) {
			if (contador%2==0) {
				System.out.print("El alumno ");
				System.out.print(tokens.nextToken());
			}else if (contador%2!=0) {
				System.out.print("ha sacado la nota");
				System.out.println(tokens.nextToken());
			}
	        contador++;
	    }
		
	}

}
