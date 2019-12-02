package ej1p169;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import utiles.Libreria;

public class ProgramaCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Libreria a1 = new Libreria();
		
		String Host = "localhost";
		int Puerto = 6000;
		
		
		String cadena = "";
		
		
		do {
			Socket Cliente = new Socket(Host, Puerto);
			cadena = a1.excepcionstringcontexto("Introduce una cadena");
		DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
		flujoSalida.writeUTF(""+cadena);
		
		DataInputStream flujoentrada = new DataInputStream(Cliente.getInputStream());
		System.out.println(flujoentrada.readUTF());
		
		
		flujoSalida.close();
		flujoentrada.close();
		Cliente.close();
		} while (!cadena.equalsIgnoreCase("*"));
	}

}
