package ej1;

import java.io.IOException;

public abstract class Cuenta {
	private long numerocuenta;
	private double saldo;
	Persona cliente = new Persona();
	
	public Cuenta(long numerocuenta, Persona cliente){
			this.numerocuenta=numerocuenta;
			this.cliente=cliente;
	}
	
	public double ingresar(double cantidad){
		saldo=saldo+cantidad;
		return saldo;
	}
	
	public abstract double retirar(double cantidad);
	
	public abstract void actualizarSaldo() throws IOException;
	
	public long getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(long numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	

}
