package ej6;

public class Obras {
	
	private String titulo;
	private int ninventario;
	private String autor;
	private int a�o;
	
	Obras() {
		
	}
	
	Obras(String titulo, int ninventario, String autor, int a�o) {
		this.titulo=titulo;
		this.ninventario=ninventario;
		this.autor=autor;
		this.a�o=a�o;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNinventario() {
		return ninventario;
	}

	public void setNinventario(int ninventario) {
		this.ninventario = ninventario;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

}
