package ej4;

public class Empleado extends Direccion{

	String nombre;
	int salario;
	Direccion d;
	
	
	Empleado(String nombre, int salario, Direccion d){
	super(d.getCalle(),d.getNumero(),d.getPiso(),d.getCiudad());
	this.nombre=nombre;
	this.salario=salario;
	}


		void mostrar() {
		int a1=1;
		a1++;
		System.out.println("Empleado "+a1+":");
		System.out.println("Salario: "+salario);
		System.out.println("Direccion:");
		System.out.println("          Calle: "+calle);
		System.out.println("          Número: "+numero);
		System.out.println("          Puerta: "+piso);
		System.out.println("          Ciudad: "+ciudad);
	}

}
