package ej3;

public class Mayorymenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriza[][] =new int[5][5];
		int contador=0;
		int mayor=0;
		int posmayor1 = 0;
		int posmayor2 = 0;
		int menor=20;
		int posmenor1 = 0;
		int posmenor2 = 0;
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matriza.length; j++) {
				matriza[i][j]=(int) (Math.random() * 20) + 1;
				if (matriza[i][j]>mayor) {
					mayor=matriza[i][j];
					posmayor1=i;
					posmayor2=j;
				}
				if (matriza[i][j]<menor) {
					menor=matriza[i][j];
					posmenor1=i;
					posmenor2=j;
				}
				System.out.print(matriza[i][j]+" ");
				contador++;
				if (contador==matriza.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		
		System.out.println("Número mayor: "+mayor+" y su poscición es: "+posmayor1+" "+posmayor2);
		System.out.println("Número menor: "+menor+" y su poscición es: "+posmenor1+" "+posmenor2);
		
	}
	
}
