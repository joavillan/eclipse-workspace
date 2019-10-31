package ej6;

public class Esculturas extends Obras {

	private String material;
	private double altura;
	
	Esculturas() {
		
	}
	
	Esculturas(String titulo, int ninventario, String autor, int año, String material, double altura) {
		super(titulo, ninventario, autor, año);
		this.material=material;
		this.altura=altura;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return getTitulo()+" es una escultura realizada por "+getAutor()+ " en el año "+getAño() +" construido en "+getMaterial()+" y una altura de "+getAltura()+". \n Su numero de inventario es  "+getNinventario();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
