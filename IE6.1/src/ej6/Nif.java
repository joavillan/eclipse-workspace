package ej6;

import java.io.IOException;
import java.util.regex.Pattern;

import utiles.Libreria;

public class Nif {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1=new Libreria();
		
		
		
		boolean num=false;
		
		do {
			System.out.print("Introduce DNI a comprobar: ");
			String nif = a1.excepcionstring();
			
			if (nif.length()==9) {
				for (int i = 0; i <= 7; i++) {
					if (nif.charAt(i)=='0' || nif.charAt(i)=='1' || nif.charAt(i)=='2' || nif.charAt(i)=='3' || nif.charAt(i)=='4' || nif.charAt(i)=='5' || nif.charAt(i)=='6' || nif.charAt(i)=='7' || nif.charAt(i)=='8' || nif.charAt(i)=='9') {
						num=true;
					}else {
						num=false;
						System.out.println("DNI incorrecto");
						break;
					}
				}
			
				String letra = Character.toString(nif.charAt(8));
				if (num==true) {
					boolean alfa = Pattern.matches("^[a-zA-Z]*$", letra);
					if (alfa==true) {
						num=true;
					}else if (alfa==false) {
						num=false;
						System.out.println("DNI incorrecto");
					}
				}else {
					num=false;
				}
			}else {
				System.out.println("DNI incorrecto");
				num=false;
			}
		} while (num!=true);

		if (num==true) {
			System.out.println("DNI correcto");
		}
	}

}
