package ej7;

import java.io.Serializable;

public class Numeros implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int numero;
	long cuadrado;
	long cubo;
	
	public Numeros(){
		
	}

	public Numeros(int numero, long cuadrado, long cubo) {
		super();
		this.numero = numero;
		this.cuadrado = cuadrado;
		this.cubo = cubo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public long getCuadrado() {
		return cuadrado;
	}

	public void setCuadrado(long cuadrado) {
		this.cuadrado = cuadrado;
	}

	public long getCubo() {
		return cubo;
	}

	public void setCubo(long cubo) {
		this.cubo = cubo;
	}

	@Override
	public String toString() {
		return "Numeros [numero=" + numero + ", cuadrado=" + cuadrado + ", cubo=" + cubo + "]";
	}
	
}
