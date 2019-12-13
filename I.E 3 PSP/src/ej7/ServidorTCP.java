package ej7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			int Puerto = 6000;
			ServerSocket Servidor = new ServerSocket(Puerto);
			
			Socket clienteConectado = null;
			
			System.out.println("Esperando cliente.......");
			
			int numero = 0;
			
			clienteConectado = Servidor.accept();
			
			ObjectInputStream flujoentrada = new ObjectInputStream(clienteConectado.getInputStream());
			ObjectOutputStream flujoSalida = new ObjectOutputStream(clienteConectado.getOutputStream());
			
			do {
				Numeros n = (Numeros)flujoentrada.readObject();
				numero = n.getNumero();
				
				n.setCuadrado((long) Math.pow(numero, 2));
				n.setCubo((long) Math.pow(numero, 3));
				
				flujoSalida.writeObject(n);
				
			} while (numero > 0);
			
			flujoentrada.close();
			flujoSalida.close();
			clienteConectado.close();
			Servidor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
