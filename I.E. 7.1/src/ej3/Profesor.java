package ej3;

public class Profesor extends Persona {

	private String despacho;
	
	Profesor() {
		
	}
	
	Profesor(String nombre, String apellidos, String nif, Direccion direccion, String despacho){
		super(nombre, apellidos, nif, direccion);
		this.despacho=despacho;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return "Profesor: " + getNombre()+ " "+ getApellidos()+ " DNI: "+getNif() + " Despacho: "+ despacho+" Dirección: "+direccion;
	}
	
	@Override
	public void identificarse() {
		toString();
	}
}
