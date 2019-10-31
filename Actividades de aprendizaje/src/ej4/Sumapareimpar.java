package ej4;

public class Sumapareimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arraya[] =new int[20];
		int suma=0;
		int mayorimpar=0;
		int contenedor=0;
		
		
		for (int i = 0; i < arraya.length; i++) {
			arraya[i]=(int) (Math.random() * 20) + 1;
			int contenedor2=arraya[i];
			if (i%2==0) {
				suma=arraya[i]+contenedor;
				contenedor=arraya[i];
			}else if (i%2!=0) {
				if (arraya[i]>=contenedor2) {
					mayorimpar=arraya[i];
				}
			}
			System.out.print(arraya[i]+" ");
		}
		System.out.println("");
		System.out.println("La suma de las posiciones pares es: "+suma);
		System.out.println("El mayor número de las posiciones impares es el: "+mayorimpar);
	}

}
