package ej5;

public class arrayprimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arraya[] =new int[20];
		int contador=0;
		int contadorprimos=0;
		
		for (int i = 0; i < arraya.length; i++) {
			arraya[i]=(int) (Math.random() * 20) + 1;
			for (contador = 2; contador <= arraya.length; contador++) {
				if (arraya[i]%contador==0) {
					contadorprimos++;
				}
			}
			if (contadorprimos==1) {
				System.out.println(arraya[i]);
			}
		}
		
		for (int i = 0; i < arraya.length; i++) {
			System.out.print(arraya[i]+" ");
		}
	}

}
