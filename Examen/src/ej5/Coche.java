package ej5;

public class Coche extends Vehiculo{
	
	private int numPuertas;

	@Override
	public void setNruedas(int nruedas) {
		// TODO Auto-generated method stub
		nruedas=4;
		super.setNruedas(nruedas);
	}
	
	Coche(String matricula, String color){
		super(matricula, color, 4);
	}
	
	Coche(String matricula, String color, int cilindrada){
		super(matricula, color, 4, cilindrada);
	}
	
	Coche(String matricula, String color, int cilindrada, int potencia){
		super(matricula, color, 4, cilindrada, potencia);
	}
	
	Coche(String matricula, String color, int cilindrada, int potencia, int numPuertas){
		super(matricula, color, 4, cilindrada, potencia);
		this.numPuertas=numPuertas;
	}
	
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	void imprimircoche(){
		System.out.println("Información del coche");
		System.out.println("La matricula es: "+getMatricula());
		System.out.println("El color es: "+getColor());
		System.out.println("El número de puertas es: "+numPuertas);
	}
}
