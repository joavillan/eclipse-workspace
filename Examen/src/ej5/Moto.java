package ej5;

public class Moto extends Vehiculo{

	private int numPlazas;
	
	@Override
	public void setNruedas(int nruedas) {
		// TODO Auto-generated method stub
		nruedas=2;
		super.setNruedas(nruedas);
	}
	
	
	Moto(String matricula, String color){
		super(matricula,color, 2);
	}
	
	Moto(String matricula, String color, int cilindrada){
		super(matricula,color, 2, cilindrada);
	}

	Moto(String matricula, String color, int cilindrada, int potencia){
		super(matricula,color, 2, cilindrada, potencia);
	}
	
	Moto(String matricula, String color, int cilindrada, int potencia, int numPlazas){
		super(matricula,color, 2, cilindrada, potencia);
		this.numPlazas=numPlazas;
	}
	
	void imprimirmoto() {
		System.out.println("Información de la moto");
		System.out.println("La matricula es: "+getMatricula());
		System.out.println("El color es: "+getColor());
		System.out.println("El número de plazas es: "+ numPlazas);
	}
}
