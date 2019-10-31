package ej4;

import java.util.ArrayList;

public class Libros extends Biblioteca implements ej4.Prestable, Metodos{

	private boolean prestado = false;
	
	Libros() {
		
	}
	
	Libros(int codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		this.prestado=prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String EsPrestado() {
		if (prestado == false) {
			return "No";
		}else {
			return "Sí";
		}
	}
	
	@Override
	public String toString() {
		
		return "Título: "+ getTitulo() +" Código: "+ getCodigo() +" Año: "+ getAño() +" Prestado: "+ EsPrestado();
	}
	
	@Override
	public void ReturnCodigo() {
		// TODO Auto-generated method stub
		super.ReturnCodigo();
	}
	
	@Override
	public void ReturnAño() {
		// TODO Auto-generated method stub
		super.ReturnAño();
	}

	@Override
	public void prestar() {
		// TODO Auto-generated method stub
		setPrestado(true);
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		setPrestado(false);
	}

	@Override
	public void prestado() {
		// TODO Auto-generated method stub
		if (isPrestado() == true) {
			System.out.println("El libro está prestado");
		}
	}
	
	public int cuentaPrestados(ArrayList<Biblioteca> b){
		int contprestados = 0;
		for (Biblioteca biblioteca : b) {
			if (biblioteca instanceof Libros) {
				if (((Libros)biblioteca).isPrestado() == true) {
					contprestados++;
				}
			}
		}
		
		return contprestados;
	}
	
	@Override
	public int publicacionesAnterioresA(ArrayList<Biblioteca> b, int año) {
		// TODO Auto-generated method stub
		return Metodos.super.publicacionesAnterioresA(b, año);
	}
	
	
}
