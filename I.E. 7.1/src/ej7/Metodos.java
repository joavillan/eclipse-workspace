package ej7;

import java.io.IOException;

public class Metodos {

	public void ejecutar() throws IOException {
		EmpleadoAsalariado e1 = new EmpleadoAsalariado("nombre", "apellido", 1651554, 200);
		EmpleadoBaseMasComision e2 = new EmpleadoBaseMasComision("nombre1", "apellido1", 65651651, 150, 250, 10, 150);
		EmpleadoPorComision e3 = new EmpleadoPorComision("nombre 3", "apellido 3", 5161651, 255, 15, 10);
		EmpleadoPorHoras e4 = new EmpleadoPorHoras("pepe", "a", 45651, 15, 36);
		
		System.out.println(e1.toString());
		e1.newSalarioSemanal();
		System.out.println(e1.toString());
		
		e2.ingresos();
		System.out.println(e2.toString());
		
		e3.ingresos();
		System.out.println(e3.toString());
		
		System.out.println(e4.toString());
		e4.ingresos();
	}
}
