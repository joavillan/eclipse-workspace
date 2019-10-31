package ej7;

public abstract class Empleado {

	private String nombre;
	private String apellido;
	private int nss;
	
	Empleado() {
		
	}
	
	Empleado(String nombre, String apellido, int nss) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.nss=nss;
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

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}
	
	@Override
	public String toString() {
		return "Empleado "+getNombre()+" "+getApellido()+" Número de la Seguridad Social: "+getNss();
	}
	
	public abstract double ingresos();
}
