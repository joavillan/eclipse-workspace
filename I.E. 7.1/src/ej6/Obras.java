package ej6;

public class Obras {
	
	private String titulo;
	private int ninventario;
	private String autor;
	private int año;
	
	Obras() {
		
	}
	
	Obras(String titulo, int ninventario, String autor, int año) {
		this.titulo=titulo;
		this.ninventario=ninventario;
		this.autor=autor;
		this.año=año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

}
