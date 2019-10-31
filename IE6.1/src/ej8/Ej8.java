package ej8;

import java.util.StringTokenizer;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		StringTokenizer tokens=new StringTokenizer(cadena, "\n");
		int contador=0;
		double [] nota = new double [4];
		int i=0;
		
		while (tokens.hasMoreTokens()) {
			if (contador%2==0) {
				System.out.print("El alumno ");
				System.out.print(tokens.nextToken());
			}else if (contador%2!=0) {
				System.out.print("ha sacado la nota");
				nota[i]=Double.parseDouble(tokens.nextToken());
				System.out.println(" "+nota[i]);
				
				i++;
			}
	        contador++;
	    }
		
		for (i = 0; i < nota.length; i++) {
			System.out.println(nota[i]);
		}
	}

}
