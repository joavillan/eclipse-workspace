package ej3p106;

public class UsaHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador [] c = {c1,c2};

		for (int i = 0; i < c.length; i++) {
			long t_comienzo, t_fin;
			t_comienzo = System.currentTimeMillis();
			new Thread(c[i]).start();
			t_fin = System.currentTimeMillis();
			long tiempototal = t_fin + t_comienzo;
			System.out.println("El proceso ha tardado: "+tiempototal+" milisegundos");
		}
		
	}

}
