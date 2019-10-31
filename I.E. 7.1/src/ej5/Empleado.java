package ej5;

public abstract class Empleado implements Calculos {
	
	private String nombre;
	private String dni;
	
	Empleado() {
		
	}
	
	Empleado(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public abstract double calcularSueldo();
}
