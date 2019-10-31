package ej1;

import java.io.IOException;

import utiles.Libreria;

public class CuentaAhorro extends Cuenta{
	Libreria a1 = new Libreria();
	Persona cliente = new Persona();
	
	private double interesvariable;
	private double saldominimo = 100;

	public CuentaAhorro(long numerocuenta, Persona cliente) {
		super(numerocuenta, cliente);
		this.cliente=cliente;
	}

	@Override
	public double ingresar(double cantidad) {
		// TODO Auto-generated method stub
		return super.ingresar(cantidad);
	}
	
	@Override
	public double retirar(double cantidad){
		if (cantidad>saldominimo) {
			System.out.println("No puede sobrepasar el saldo mínimo");
		}else {
			double sald = getSaldo()-cantidad;
			setSaldo(sald);
		}
		return getSaldo();
	}

	@Override
	public void actualizarSaldo() throws IOException {
		interesvariable=a1.excepciondoublecontexto("Introduce el interés variable");
		double intereses=getSaldo()/100*interesvariable;
		setSaldo(getSaldo()+intereses);
	}

	public double getInteresvariable() {
		return interesvariable;
	}

	public void setInteresvariable(double interesvariable) {
		this.interesvariable = interesvariable;
	}
	
	@Override
	public String toString() {
		
		return "Cuenta Ahorro \n"+"Número de cuenta"+ getNumerocuenta()+"\n"+cliente.toString()+"\n Saldo: "+ getSaldo()+ "\n Interes variable:" +interesvariable+"\n Saldo mínimo: "+saldominimo;
	}
	
	
}
