package ej4;

public abstract class Biblioteca {

	private int  codigo;
	private String titulo;
	private int a�o;
	
	Biblioteca() {
		
	}
	
	Biblioteca(int codigo, String titulo, int a�o) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.a�o=a�o;
	}
	
	public void ReturnA�o() {
		System.out.println("A�o de publicaci�n: "+getA�o());
	}
	
	public void ReturnCodigo() {
		System.out.println("C�digo del producto: "+getCodigo());
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
}
