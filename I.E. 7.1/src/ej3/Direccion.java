package ej3;

public class Direccion {

	private String calle;
	private String ciudad;
	private int cod_postal;
	private String pais;
	
	Direccion() {
		
	}
	
	Direccion(String calle, String ciudad, int cod_postal, String pais) {
		this.calle=calle;
		this.ciudad=ciudad;
		this.cod_postal=cod_postal;
		this.pais=pais;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCod_postal() {
		return cod_postal;
	}
	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
