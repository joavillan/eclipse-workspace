package ej4;

import java.util.ArrayList;

public class Revistas extends Biblioteca implements Metodos {

	private int numero;
	
	Revistas() {
		
	}
	
	Revistas(int codigo, String titulo, int a�o, int numero) {
		super(codigo, titulo, a�o);
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		
		return "T�tulo: "+ getTitulo() +" C�digo: "+ getCodigo() +" A�o: "+ getA�o() +" N�mero: "+ getNumero();
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
	public int publicacionesAnterioresA(ArrayList<Biblioteca> b, int a�o) {
		// TODO Auto-generated method stub
		return Metodos.super.publicacionesAnterioresA(b, a�o);
	}
}
