package ej3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int Puerto = 6000;
		ServerSocket Servidor = new ServerSocket(Puerto);
		
		Socket clienteConectado = null;
		
		System.out.println("Esperando cliente.......");
		clienteConectado = Servidor.accept();

		OutputStream salida = null;
		salida = clienteConectado.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);
		
		String texto = "OLA QUE TAL";
		
		flujoSalida.writeUTF(texto);
		
		InputStream entrada = null;
		entrada = clienteConectado.getInputStream();
		DataInputStream flujoentrada = new DataInputStream(entrada);
		
		System.out.println("Mensaje en minúsculas: "+flujoentrada.readUTF());
		
		entrada.close();
		flujoentrada.close();
		salida.close();
		flujoSalida.close();
		clienteConectado.close();
		Servidor.close();
	}

}
