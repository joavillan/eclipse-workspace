package ej4;

import java.util.ArrayList;

public class Libros extends Biblioteca implements ej4.Prestable, Metodos{

	private boolean prestado = false;
	
	Libros() {
		
	}
	
	Libros(int codigo, String titulo, int a�o, boolean prestado) {
		super(codigo, titulo, a�o);
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
			return "S�";
		}
	}
	
	@Override
	public String toString() {
		
		return "T�tulo: "+ getTitulo() +" C�digo: "+ getCodigo() +" A�o: "+ getA�o() +" Prestado: "+ EsPrestado();
	}
	
	@Override
	public void ReturnCodigo() {
		// TODO Auto-generated method stub
		super.ReturnCodigo();
	}
	
	@Override
	public void ReturnA�o() {
		// TODO Auto-generated method stub
		super.ReturnA�o();
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
			System.out.println("El libro est� prestado");
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
	public int publicacionesAnterioresA(ArrayList<Biblioteca> b, int a�o) {
		// TODO Auto-generated method stub
		return Metodos.super.publicacionesAnterioresA(b, a�o);
	}
	
	
}
