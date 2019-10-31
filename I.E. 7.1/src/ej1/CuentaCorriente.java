package ej1;

public class CuentaCorriente extends Cuenta {
	
	private double interes=1.5;
	Persona cliente = new Persona();

	CuentaCorriente(long numerocuenta, Persona cliente) {
		super(numerocuenta, cliente);
		this.cliente=cliente;
	}
	
	@Override
	public double ingresar(double cantidad) {
		// TODO Auto-generated method stub
		return super.ingresar(cantidad);
	}
	
	@Override
	public String toString() {
		
		return "Cuenta Corriente \n"+"Número de cuenta"+ getNumerocuenta()+"\n"+cliente.toString()+"Saldo: "+ getSaldo()+ "Intereses :" +interes;
	}

	@Override
	public double retirar(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarSaldo() {
		double intereses=getSaldo()/100*interes;
		setSaldo(getSaldo()+intereses);
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	
}
