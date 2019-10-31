package ej2;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriza[][] =new int[5][5];
		int matrizb[][] =new int[5][5];
		int matrizc[][]=new int [5][5];
		int contador=0;
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matriza.length; j++) {
				matriza[i][j]=(int) (Math.random() * 20) + 1;
				System.out.print(matriza[i][j]+" ");
				contador++;
				if (contador==matriza.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		System.out.println("");
		System.out.println("Fin matriz a");
		
		for (int i = 0; i < matrizb.length; i++) {
			for (int j = 0; j < matrizb.length; j++) {
				matrizb[i][j]=(int) (Math.random() * 20) + 1;
				System.out.print(matrizb[i][j]+" ");
				contador++;
				if (contador==matrizb.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		System.out.println("");
		System.out.println("Fin array b");
		
		System.out.println("");
		System.out.println("Suma de ambos arrays");
		for (int i = 0; i < matrizc.length; i++) {
			for (int j = 0; j < matrizc.length; j++) {
				matrizc[i][j]=matriza[i][j]+matrizb[i][j];
				matriza[i][j]++;
				matrizb[i][j]++;
				contador++;
				System.out.print(matrizc[i][j]+" ");
				if (contador==matrizc.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
	
	}

}
