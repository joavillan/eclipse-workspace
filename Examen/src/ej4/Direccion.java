package ej4;

public class Direccion {

	String calle;
	int numero;
	int piso;
	String ciudad;
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}
	
	Direccion(String calle, int numero, int piso, String ciudad){
		this.calle=calle;
		this.numero=numero;
		this.piso=piso;
		this.ciudad=ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
