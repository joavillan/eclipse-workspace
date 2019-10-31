package ej5;

import java.io.IOException;

import utiles.Libreria;

public interface Calculos{
	Libreria a1 = new Libreria();
	
	public double calcularSueldo();

	public default double retencion() {
		double sueldo = calcularSueldo();
		double retencion;
		if (sueldo<1000) {
			retencion = 12;
		} else if (sueldo<1500) {
			retencion = 15;
		} else if (sueldo < 2500) {
			retencion = 18;
		} else {
			retencion = 20;
		}
		return retencion;
	}
	
	public default double gratificacion(int nhijos) {
		double gratificacion = 0;
		if (nhijos >0 & nhijos <= 3) {
			gratificacion = 200;
		} else if (nhijos > 3) {
			gratificacion = 300;
		}
		return gratificacion;
	}
	
	public default double calcular() throws IOException {
		double retencion = calcularSueldo()/100*retencion();
		double sueldo = calcularSueldo()-retencion;
		return sueldo;
	}
	
}
