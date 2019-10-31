package ej7;

public class Intercambiar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriza[][] =new int[5][5];
		int matrizb[][] =new int[5][5];
		int contador=0;
		int menor=20;
		int mayor=0;
		int posiciona1 = 0;
		int posiciona2 = 0;
		int posicionb1 = 0;
		int posicionb2 = 0;
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matriza.length; j++) {
				matriza[i][j]=(int) (Math.random() * 20) + 1;
				if (matriza[i][j]<=menor) {
					menor=matriza[i][j];
					posiciona1=i;
					posiciona2=j;
				}
			}
		}
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matrizb.length; j++) {
				System.out.print(matriza[i][j]+" ");
				contador++;
				if (contador==matriza.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		System.out.println("Fin de la matriz A");
		System.out.println("");
		
		for (int i = 0; i < matrizb.length; i++) {
			for (int j = 0; j < matrizb.length; j++) {
				matrizb[i][j]=(int) (Math.random() * 20) + 1;
				if (matriza[i][j]>=mayor) {
					mayor=matriza[i][j];
					posicionb1=i;
					posicionb2=j;
				}
			}
		}
		
		for (int i = 0; i < matrizb.length; i++) {
			for (int j = 0; j < matrizb.length; j++) {
				System.out.print(matrizb[i][j]+" ");
				contador++;
				if (contador==matrizb.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		System.out.println("Fin de la matriz B");
		System.out.println("");
		System.out.println("Matrices con números cambiados: ");
		System.out.println("");
		
		matriza[posiciona1][posiciona2]=mayor;
		matrizb[posicionb1][posicionb2]=menor;
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matrizb.length; j++) {
				System.out.print(matriza[i][j]+" ");
				contador++;
				if (contador==matriza.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		System.out.println("Fin de la matriz A");
		System.out.println("");
		
		for (int i = 0; i < matrizb.length; i++) {
			for (int j = 0; j < matrizb.length; j++) {
				System.out.print(matrizb[i][j]+" ");
				contador++;
				if (contador==matrizb.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
	}
}
