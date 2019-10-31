package ej1;

public class Contarvocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena="murcielago";
		int contador=0;
		
		for(int i=0;i<cadena.length();i++) {
			  if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){
			    contador++;
			  }
		}
		
		System.out.println("La palabra " + cadena + " tiene " + contador + " vocales");
	}

}
