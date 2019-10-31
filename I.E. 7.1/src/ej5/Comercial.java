package ej5;

public class Comercial extends Empleado {

	private double sueldob;
	private double importev;
	
	Comercial() {
		
	}
	
	Comercial(String nombre, String dni, double sueldob, double importev) {
		super(nombre, dni);
		this.sueldob=sueldob;
		this.importev=importev;
	}
	
	public double getSueldob() {
		return sueldob;
	}

	public void setSueldob(double sueldob) {
		this.sueldob = sueldob;
	}

	public double getImportev() {
		return importev;
	}

	public void setImportev(double importev) {
		this.importev = importev;
	}

	public double rcomision() {
		double comision = importev/100*10;
		return comision;
	}

	@Override
	public double calcularSueldo() {
		double a = sueldob + rcomision();
		return a;
	}
}
