package ej1p169;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import utiles.Libreria;

public class ServidorTCP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Libreria a1 = new Libreria();
		int Puerto = 6000;
		ServerSocket Servidor = new ServerSocket(Puerto);
		String cadena = "";
		
		//cadena = a1.excepcionstringcontexto("Continuar Sí(intro) No (*)");
		do {
			Socket clienteConectado = null;
			System.out.println("Esperando cliente.......");
			clienteConectado = Servidor.accept();
			cadena = a1.excepcionstring();
			InputStream entrada = null;
			entrada = clienteConectado.getInputStream();
			DataInputStream flujoentrada = new DataInputStream(entrada);
			
			String recibo = flujoentrada.readUTF();
			int longitud = recibo.length();
			//int cuadrado = Integer.parseInt(numero);
			//cuadrado = cuadrado*cuadrado;

			OutputStream salida = null;
			salida = clienteConectado.getOutputStream();
			DataOutputStream flujoSalida = new DataOutputStream(salida);
			
			flujoSalida.writeUTF("Tamaño cadena: "+longitud);
			
			entrada.close();
			flujoentrada.close();
			salida.close();
			flujoSalida.close();
			clienteConectado.close();
			
		} while (!cadena.equalsIgnoreCase("*"));
		
		Servidor.close();
		//clienteConectado.close();
		/*do {
			
		} while (!cadena.equalsIgnoreCase("*"));*/
		//Servidor.close();
	}

}
