package ej5;

public class Directivo extends Empleado{

	private double sueldo;
	private double comision;
	
	Directivo(){
		
	}
	
	Directivo(String nombre, String dni, double sueldo, double comision) {
		super(nombre, dni);
		this.sueldo=sueldo;
		this.comision=comision;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public double calcularSueldo() {
		double a = sueldo + comision;
		return a;
	}
	
}
