package ej1;

import java.io.IOException;

import utiles.Libreria;

public class UsuarioyContrase�a {

	public static void contrase�a() throws IOException {
		Libreria a1 = new Libreria();
		
		boolean longitud = false;
		boolean num = false;
		boolean usuarioencontrase�a = true;
		
		do {
			System.out.println("Introduce el usuario: ");
			String usuario = a1.excepcionstring();
			
			System.out.print("Introduce la contrase�a: ");
			String contrase�a = a1.excepcionstring();
			
			if (contrase�a.length()<6) {
				longitud = false;
				System.out.println("La contraser�a debe tener al menos seis caracteres");
			}else {
				longitud = true;
			}
			
			int contadornum = 0;
			
			for (int i = 0; i < contrase�a.length(); i++) {
				if (contrase�a.charAt(i)=='0' || contrase�a.charAt(i)=='1' || contrase�a.charAt(i)=='2' || contrase�a.charAt(i)=='3' || contrase�a.charAt(i)=='4' || contrase�a.charAt(i)=='5' || contrase�a.charAt(i)=='6' || contrase�a.charAt(i)=='7' || contrase�a.charAt(i)=='8' || contrase�a.charAt(i)=='9') {
					contadornum++;
				}
			}
			if (contadornum>=2) {
				num = true;
			}else {
				num = false;
				System.out.println("La contrase�a debe tener al menos 2 digitos");
			}
			
			int j = 0;
			int contadorusuario = 0;
			if (contrase�a.length()<=usuario.length()) {
				for (int i = 0; i < contrase�a.length(); i++) {
					if (contrase�a.charAt(i) == usuario.charAt(j)) {
						j++;
						contadorusuario++;
					}
				}
				
				if (contadorusuario == usuario.length()) {
					usuarioencontrase�a = true;
					System.out.println("La contrase�a no puede contener al usuario");
				}else {
					usuarioencontrase�a = false;
				}
			}else {
				for (int i = 0; i < usuario.length(); i++) {
					if (contrase�a.charAt(i) == usuario.charAt(j)) {
						j++;
						contadorusuario++;
					}
				}
				
				if (contadorusuario == usuario.length()) {
					usuarioencontrase�a = true;
					System.out.println("La contrase�a no puede contener al usuario");
				}else {
					usuarioencontrase�a = false;
				}
			}
		} while (longitud != true | num != true | usuarioencontrase�a != false);
		
		System.out.println("Usuario y contrase�a correctos.");
	}
}
