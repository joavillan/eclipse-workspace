package ej7;

public class EmpleadoPorHoras extends Empleado {

	private double sueldoph;
	private double horas;
	
	EmpleadoPorHoras() {
		
	}
	
	EmpleadoPorHoras(String nombre, String apellido, int nss, double sueldoph, double horas) {
		super(nombre, apellido, nss);
		this.sueldoph=sueldoph;
		this.horas=horas;
	}

	public double getSueldoph() {
		return sueldoph;
	}

	public void setSueldoph(double sueldoph) {
		this.sueldoph = sueldoph;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	@Override
	public double ingresos() {
		double sueldo = 0;
		if (getHoras()>=40) {
			sueldo = getSueldoph()*getHoras();
		}else if (getHoras()>40) {
			double resto = getHoras()-40;
			sueldo = getSueldoph()*40+resto*(getSueldoph()*1.5);
		}
		return sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado "+getNombre()+" "+getApellido()+" Número de la Seguridad Social: "+getNss()+" Sueldo por horas: "+getSueldoph()+ " Número de horas trabajadas: "+getHoras();
	}
}
