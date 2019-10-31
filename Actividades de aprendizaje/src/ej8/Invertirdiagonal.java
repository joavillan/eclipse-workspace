package ej8;

public class Invertirdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraya[] =new int [5];
		int matriza[][] =new int[5][5];
		int contador=0;
		
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matriza.length; j++) {
				matriza[i][j]=(int) (Math.random() * 9) + 1;
				if (i==j) {
					int j2 = 0;
					arraya[j2]=matriza[i][j];
					j2++;
				}
			}
		}
		
		for (int i = 0; i < matriza.length; i++) {
			for (int j = 0; j < matriza.length; j++) {
				System.out.print(matriza[i][j]+" ");
				contador++;
				if (contador==matriza.length) {
					System.out.println("");
					contador=0;
				}
			}
		}
		System.out.println("");
		
		for (int j2 = 0; j2 < matriza.length; j2++) {
			System.out.println(arraya[j2]+" ");
		}
		
	}

}
