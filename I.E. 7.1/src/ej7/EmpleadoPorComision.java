package ej7;

public class EmpleadoPorComision extends Empleado {

	private double ventasBrutas;
	private double tarifaComision;
	
	EmpleadoPorComision() {
		
	}
	
	EmpleadoPorComision(String nombre, String apellido, int nss, double salarioSemanal, double ventasBrutas, double tarifaComision) {
		super(nombre, apellido, nss);
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
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
	
	@Override
	public double ingresos() {
		double dinero = 0;
		dinero = getVentasBrutas()*getTarifaComision();
		return dinero;
	}
	
	@Override
	public String toString() {
		return "Empleado "+getNombre()+" "+getApellido()+" Número de la Seguridad Social: "+getNss()+" Ventas brutas: "+getVentasBrutas()+ " Tarifa de comisión: "+getTarifaComision();
	}
}
