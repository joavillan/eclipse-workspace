package ej6;

public class Pinturas extends Obras {

	private double ancho;
	private double alto;
	private String soporte;
	
	Pinturas() {
		
	}
	
	Pinturas(String titulo, int ninventario, String autor, int año, double ancho, double alto, String soporte) {
		super(titulo, ninventario, autor, año);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}
	
	@Override
	public String toString() {
		return getTitulo()+" es una pintura realizada por "+getAutor()+ " en el año "+getAño() +" con unas dimensiones de "+getAlto()+" de altura y "+getAncho()+" de ancho. \n Su numero de inventario es  "+getNinventario();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
