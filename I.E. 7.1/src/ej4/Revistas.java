package ej4;

import java.util.ArrayList;

public class Revistas extends Biblioteca implements Metodos {

	private int numero;
	
	Revistas() {
		
	}
	
	Revistas(int codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		
		return "Título: "+ getTitulo() +" Código: "+ getCodigo() +" Año: "+ getAño() +" Número: "+ getNumero();
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
	public int publicacionesAnterioresA(ArrayList<Biblioteca> b, int año) {
		// TODO Auto-generated method stub
		return Metodos.super.publicacionesAnterioresA(b, año);
	}
}
