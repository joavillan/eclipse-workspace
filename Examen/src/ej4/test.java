package ej4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direccion d1=new Direccion("León",32,3,"Sevilla");
		Direccion d2=new Direccion("Benito",12,6,"Córdoba");
		Direccion d3=new Direccion("Lugo",2,1,"Madrid");
		
		Empleado e1=new Empleado("Juan",1500,d1);
		Empleado e2=new Empleado("Pepe",1200,d2);
		Empleado e3=new Empleado("Emilio",2200,d3);
		
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
	}

}
