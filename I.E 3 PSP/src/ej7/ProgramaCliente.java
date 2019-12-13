package ej7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import utiles.Libreria;

public class ProgramaCliente {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		try {
			String Host = "localhost";
			int Puerto = 6000;
			Libreria a1 = new Libreria();
			
			Socket Cliente = new Socket(Host, Puerto);
			
			ObjectOutputStream flujoSalida = new ObjectOutputStream(Cliente.getOutputStream());
			ObjectInputStream flujoentrada = new ObjectInputStream(Cliente.getInputStream());
			
			Numeros n = new Numeros();
			//n.setNumero(1);
			do {
				n.setNumero(a1.excepcionintcontexto("Introduce un numero (0 para finalizar)"));
				
				flujoSalida.writeObject(n);
				
				n = (Numeros)flujoentrada.readObject();
				
				System.out.println(n);
				
			} while (n.getNumero() > 0);
			
			flujoSalida.close();
			flujoentrada.close();
			Cliente.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
