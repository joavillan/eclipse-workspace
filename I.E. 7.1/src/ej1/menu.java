package ej1;

import java.io.IOException;
import java.util.ArrayList;

import utiles.Libreria;

public class menu {
	Libreria a1 = new Libreria();
	ArrayList<Cuenta> c = new ArrayList<Cuenta>();
	int contador = 0;
 	
	void vermenu () throws IOException{
		System.out.println("Seleccione una opción:");	
		System.out.println("1-Crear cuenta corriente");
		System.out.println("2-Crear cuenta ahorro");
		System.out.println("3-Acceder a una cuenta");
		System.out.println("4-Salir");
	}
	
	void crearcc() throws IOException {
		c.add(contador, new CuentaCorriente(contador, new Persona(a1.excepcionstringcontexto("Introduce el nombre del titular de la cuenta"),a1.excepcionstringcontexto("Introduce los apellidos del titular de la cuenta"),a1.excepcionstringcontexto("Introduce el DNI del titular de la cuenta"))));
		contador++;
	}
	
	void crearca() throws IOException {
		c.add(contador, new CuentaAhorro(contador, new Persona(a1.excepcionstringcontexto("Introduce el nombre del titular de la cuenta"),a1.excepcionstringcontexto("Introduce los apellidos del titular de la cuenta"),a1.excepcionstringcontexto("Introduce el DNI del titular de la cuenta"))));
		contador++;
	}
	
	void menu3() throws IOException {
		boolean bool = false;
		do {
			int index = a1.excepcionintcontexto("Introduce número de cuenta");
			try {
				c.get(index);
				Cuenta cc = c.get(index);
				int key = 0;
				do {
					switch (key=a1.excepcionintcontexto("¿Qué desea realizar? \n 1-Retirar dinero \n 2-Ingresar dinero \n 3-Actualizar información \n 4-Ver información \n 5-Salir")) {
					case 1:
						
						double cantidad = a1.excepciondouble();
						cc.retirar(cantidad);
						break;
					case 2:
						cantidad = a1.excepciondouble();
						cc.ingresar(cantidad);
						break;
					case 3:
						cc.actualizarSaldo();
						break;
					case 4:
						System.out.println(c.toString());;
						break;
					case 5:
						System.out.println("...Saliendo...");
						break;

					default:
						System.out.println("Opción inválida. Introduce la opción deseada");
						break;
					}
				} while (key!=5);
				bool=true;
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("El número de cuenta no existe, vuelva a introducirlo");
				bool=false;
			}
		} while (bool == false);
		
	}
	
	void metermenu() throws IOException{
		int a = 0;
		do {
			vermenu();
			a = a1.excepcionint();
			switch (a) {
			case 1:
				crearcc();
				break;
			case 2:
				crearca();
				break;
			case 3:
				menu3();
				break;
			case 4:
				System.out.println("...Saliendo...");
				break;
		
			default:
				System.out.println("Valor erroneo, vuelva a introducirlo");
				break;
			}
		} while (a!=4);
	}
	
}
