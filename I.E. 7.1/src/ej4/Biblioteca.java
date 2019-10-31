package ej4;

public abstract class Biblioteca {

	private int  codigo;
	private String titulo;
	private int año;
	
	Biblioteca() {
		
	}
	
	Biblioteca(int codigo, String titulo, int año) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.año=año;
	}
	
	public void ReturnAño() {
		System.out.println("Año de publicación: "+getAño());
	}
	
	public void ReturnCodigo() {
		System.out.println("Código del producto: "+getCodigo());
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
}
