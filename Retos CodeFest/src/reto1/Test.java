package reto1;

import utiles.Libreria;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libreria a1 = new Libreria();
		
		 String palabra = "rincewind";
		 int difesp = 0;
		 
		 for (int i = 0; i < palabra.length(); i++) {
			Character a = palabra.charAt(i);
			
			;
			
			if(i<palabra.length()-1) {
				Character b = palabra.charAt(i+1);
				difesp = a.getNumericValue(a)-b.getNumericValue(a);
				difesp = Math.abs(difesp);
				System.out.println(difesp);
				
				for (int j = 0; j < difesp; j++) {
					System.out.print(a);
				}
			}
		}
		
	}

}
