package ejedmodo;

public class Persona {

	String nombre;
	String apellido;
	String nif;
	
	Persona(){
		nombre="Pepe";
		apellido="Sanz";
		nif="23882422A";
	}
	
	Persona(String nombre, String apellido, String nif){
		this.nombre=nombre;
		this.apellido=apellido;
		this.nif=nif;
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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
	
}
