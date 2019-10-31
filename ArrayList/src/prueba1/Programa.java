package prueba1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> lp = new ArrayList<Persona>(); // El tipo es List y lo implementamos con ArrayList
		Random r = new Random();
		Persona temp = null;
		int sumaaltura = 0;
		
		for(int i=0;i<10;i++){
			lp.add(new Persona(i,"Persona"+i,r.nextInt(100)+100));
		}
		Iterator<Persona> it = lp.iterator();
		while(it.hasNext())
		{
		temp = it.next();
		System.out.println(temp);
		sumaaltura += temp.getAltura();
		}
		System.out.println("La media de altura del conjunto de Personas es: "+sumaaltura/lp.size());
	}

}
