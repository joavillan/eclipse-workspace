package ej5;

import java.io.IOException;

public class Ejecucion {
	
	public void ejecutar() throws IOException {
		Comercial c1 = new Comercial("Pepe", "2323223232", 1200, 200);
		Directivo d1 = new Directivo("Manuel", "23458974", 1600, 150);
		
		System.out.println("La retención de "+c1.getNombre()+" con el DNI "+ c1.getDni()+" es de "+c1.retencion()+"%");
		System.out.println("La retención de "+d1.getNombre()+" con el DNI "+ d1.getDni()+" es de "+d1.retencion()+"%");
		d1.retencion();
		
		System.out.println("La gratificación por hijos de "+c1.getNombre()+" con el DNI "+ c1.getDni()+" es de "+c1.gratificacion(0));
		System.out.println("La gratificación por hijos de "+d1.getNombre()+" con el DNI "+ d1.getDni()+" es de "+d1.gratificacion(4));
		
		System.out.println("El importe de "+c1.getNombre()+" con el DNI "+ c1.getDni()+" es de "+c1.calcular()+c1.gratificacion(0));
		System.out.println("El importe de "+d1.getNombre()+" con el DNI "+ d1.getDni()+" es de "+d1.calcular()+d1.gratificacion(4));
	}

}
