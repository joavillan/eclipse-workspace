package ej7;

import java.io.IOException;

import utiles.Libreria;

public class EmpleadoAsalariado extends Empleado {
	Libreria a1 = new Libreria();

	private double salarioSemanal;
	
	EmpleadoAsalariado() {
		
	}
	
	EmpleadoAsalariado(String nombre, String apellido, int nss, double salarioSemanal){
		super(nombre, apellido, nss);
		this.salarioSemanal=salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	public double newSalarioSemanal() throws IOException {
		setSalarioSemanal(a1.excepcionpos());
		return salarioSemanal;
	}
	
	@Override
	public String toString() {
		return "Empleado "+getNombre()+" "+getApellido()+" Número de la Seguridad Social: "+getNss()+" Salario semanala: "+getSalarioSemanal();
	}

	@Override
	public double ingresos() {
		return getSalarioSemanal();
	}
	
	
}
