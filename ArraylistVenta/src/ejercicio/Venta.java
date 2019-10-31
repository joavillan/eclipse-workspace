package ejercicio;

import utiles.Libreria;

public class Venta {
	Libreria a1 = new Libreria();

	private String nombre_mes;
	private int ventas_mes;
	
	Venta(){
		
	}
	
	Venta(String nommbre_mes, int ventas_mes){
		this.nombre_mes=nommbre_mes;
		this.ventas_mes=ventas_mes;
	}
	
	public String getNombre_mes() {
		return nombre_mes;
	}
	public void setNombre_mes(String nombre_mes) {
		this.nombre_mes = nombre_mes;
	}
	public int getVentas_mes() {
		return ventas_mes;
	}
	public void setVentas_mes(int ventas_mes) {
		this.ventas_mes = ventas_mes;
	}
	
	@Override
	public String toString() {
		return "En el mes de "+nombre_mes+" las ventas fueron "+ventas_mes;
		
	}
	
}
