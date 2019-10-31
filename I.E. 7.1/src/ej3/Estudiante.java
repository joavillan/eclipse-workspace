package ej3;

public class Estudiante extends Persona {

	private int id;
	
	public Estudiante() {
		
	}
	
	Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int id){
		super(nombre, apellidos, nif, direccion);
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Estudiante: " + getNombre()+ " "+ getApellidos()+ " DNI: "+getNif() + " ID: "+ id+" Dirección: "+direccion;
	}
	
	@Override
	public void identificarse() {
		toString();
	}
	
}
