package ej1;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arraya[] =new int[5];
		int multiplicador=0;
		int fr;
		int multiplicador2 = 0;
		
		for (int i = 0; i < arraya.length; i++) {
			int n1;
			do {
				n1=(int) (Math.random() * 20) + 1;
			} while (n1==1);
			System.out.println("Número a faactorizar: "+n1);
			arraya[i]=n1;
			for (fr=n1-1;fr>=2;fr--) {
				multiplicador=n1*fr;
				multiplicador2=multiplicador;
				n1=multiplicador2;
			}
			arraya[i]=multiplicador2;
			}
		for (int i = 0; i < arraya.length; i++) {
			System.out.println(arraya[i]);
		}
	}
}
