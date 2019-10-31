package ej6;

public class separarpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arraya[] =new int[100];
		int arraypar[] =new int[100];
		int arrayimpar[] =new int[100];
		
		for (int i = 0; i < arraya.length; i++) {
			arraya[i]=(int) (Math.random() * 1000) + 1;
			if (arraya[i]%2==0) {
				arraypar[i]=arraya[i];
			}else {
				arrayimpar[i]=arraya[i];
			}
		}
		for (int i = 0; i < arraya.length; i++) {
			System.out.print(arraya[i]+" ");
		}
		System.out.println("");
		for (int i = 0; i < arraypar.length; i++) {
			if (arraypar[i]==0) {
				
			}else if (arraypar[i]!=0) {
				System.out.print(arraypar[i]+" ");
			}
		}
		System.out.println("");
		for (int i = 0; i < arrayimpar.length; i++) {
			if (arrayimpar[i]==0) {
				
			}else if (arrayimpar[i]!=0) {
				System.out.print(arrayimpar[i]+" ");
			}
		}
	}

}
