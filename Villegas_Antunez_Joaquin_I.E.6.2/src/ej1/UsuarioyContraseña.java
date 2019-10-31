package ej1;

import java.io.IOException;

import utiles.Libreria;

public class UsuarioyContraseña {

	public static void contraseña() throws IOException {
		Libreria a1 = new Libreria();
		
		boolean longitud = false;
		boolean num = false;
		boolean usuarioencontraseña = true;
		
		do {
			System.out.println("Introduce el usuario: ");
			String usuario = a1.excepcionstring();
			
			System.out.print("Introduce la contraseña: ");
			String contraseña = a1.excepcionstring();
			
			if (contraseña.length()<6) {
				longitud = false;
				System.out.println("La contraserña debe tener al menos seis caracteres");
			}else {
				longitud = true;
			}
			
			int contadornum = 0;
			
			for (int i = 0; i < contraseña.length(); i++) {
				if (contraseña.charAt(i)=='0' || contraseña.charAt(i)=='1' || contraseña.charAt(i)=='2' || contraseña.charAt(i)=='3' || contraseña.charAt(i)=='4' || contraseña.charAt(i)=='5' || contraseña.charAt(i)=='6' || contraseña.charAt(i)=='7' || contraseña.charAt(i)=='8' || contraseña.charAt(i)=='9') {
					contadornum++;
				}
			}
			if (contadornum>=2) {
				num = true;
			}else {
				num = false;
				System.out.println("La contraseña debe tener al menos 2 digitos");
			}
			
			int j = 0;
			int contadorusuario = 0;
			if (contraseña.length()<=usuario.length()) {
				for (int i = 0; i < contraseña.length(); i++) {
					if (contraseña.charAt(i) == usuario.charAt(j)) {
						j++;
						contadorusuario++;
					}
				}
				
				if (contadorusuario == usuario.length()) {
					usuarioencontraseña = true;
					System.out.println("La contraseña no puede contener al usuario");
				}else {
					usuarioencontraseña = false;
				}
			}else {
				for (int i = 0; i < usuario.length(); i++) {
					if (contraseña.charAt(i) == usuario.charAt(j)) {
						j++;
						contadorusuario++;
					}
				}
				
				if (contadorusuario == usuario.length()) {
					usuarioencontraseña = true;
					System.out.println("La contraseña no puede contener al usuario");
				}else {
					usuarioencontraseña = false;
				}
			}
		} while (longitud != true | num != true | usuarioencontraseña != false);
		
		System.out.println("Usuario y contraseña correctos.");
	}
}
