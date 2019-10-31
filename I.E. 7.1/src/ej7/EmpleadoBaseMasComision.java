package ej7;

import java.io.IOException;

import utiles.Libreria;

public class EmpleadoBaseMasComision extends Empleado {
	Libreria a1 = new Libreria();
	
	private double ventasBrutas;
	private double tarifaComision;
	private double salarioBase;
	
	EmpleadoBaseMasComision() {
		
	}
	
	EmpleadoBaseMasComision(String nombre, String apellido, int nss, double salarioSemanal, double ventasBrutas, double tarifaComision, double salarioBase) {
		super(nombre, apellido, nss);
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
		this.salarioBase=salarioBase;
	}

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double ingresos() {
		double dinero = (getTarifaComision()*getVentasBrutas())+getSalarioBase();
		return dinero;
	}
	
	@Override
	public String toString() {
		return "Empleado "+getNombre()+" "+getApellido()+" Número de la Seguridad Social: "+getNss()+" Salario base: "+getSalarioBase()+" Ventas brutas: "+getVentasBrutas()+ " Tarifa de comisión: "+getTarifaComision();
	}
	
	public double newSalarioBase() throws IOException {
		setSalarioBase(a1.excepcionpos());
		return getSalarioBase();
	}
}
