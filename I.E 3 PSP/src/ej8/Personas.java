package ej8;

import java.io.Serializable;

public class Personas implements Serializable {

	String dni;
	String nombre;
	String apellido;
	
	public Personas() {
		// TODO Auto-generated constructor stub
	}

	public Personas(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Personas [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
