package ejedmodo;

public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona p1=new Persona();
		Persona p2=new Persona("Julio", "Pérez", "25661487l");
		
		System.out.println(p1.getNombre()+ p1.getApellido()+ p1.getNif());
		System.out.println(p2.getNombre()+ p2.getApellido()+ p2.getNif());
		
		p2.setNombre("Martín");
		
		System.out.println(p2.getNombre()+ p2.getApellido()+ p2.getNif());
	}

}
