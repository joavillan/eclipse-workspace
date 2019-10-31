package ej6;

public class Artistas {
	
	private String nombre;
	private String lugarnac;
	private String fechanac;
	private String fechadef;
	
	Artistas(){
		
	}
	
	Artistas(String nombre, String lugarnac, String fechanac, String fechadef) {
		this.nombre=nombre;
		this.lugarnac=lugarnac;
		this.fechanac=fechanac;
		this.fechadef=fechadef;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarnac() {
		return lugarnac;
	}

	public void setLugarnac(String lugarnac) {
		this.lugarnac = lugarnac;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public String getFechadef() {
		return fechadef;
	}

	public void setFechadef(String fechadef) {
		this.fechadef = fechadef;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
