package ej5;

public class Vehiculo {

	private String matricula;
	private String color;
	private int nruedas;
	private int cilindrada;
	private int potencia;
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	
	Vehiculo(String matricula, String color, int nruedas){
		this.matricula=matricula;
		this.color=color;
		this.nruedas=nruedas;
	}
	
	Vehiculo(String matricula, String color, int nruedas, int cilindrada){
		this.matricula=matricula;
		this.color=color;
		this.nruedas=nruedas;
		this.cilindrada=cilindrada;
	}
	
	Vehiculo(String matricula, String color, int nruedas, int cilindrada, int potencia){
		this.matricula=matricula;
		this.color=color;
		this.nruedas=nruedas;
		this.cilindrada=cilindrada;
		this.potencia=potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNruedas() {
		return nruedas;
	}

	public void setNruedas(int nruedas) {
		this.nruedas = nruedas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
}
