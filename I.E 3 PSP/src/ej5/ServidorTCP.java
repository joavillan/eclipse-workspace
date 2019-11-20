package ej5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int Puerto = 6000;
		int a = 0;
		int max = 3;
		
		ServerSocket Servidor = new ServerSocket(Puerto);
		
		do {
			Socket clienteConectado = null;
			
			System.out.println("Esperando cliente.......");
			clienteConectado = Servidor.accept();
			a++;

			OutputStream salida = null;
			salida = clienteConectado.getOutputStream();
			DataOutputStream flujoSalida = new DataOutputStream(salida);
			
			flujoSalida.writeUTF("Número de cliente: "+a);
			
			
			
			salida.close();
			flujoSalida.close();
			clienteConectado.close();
		} while (a<max);
		
		System.out.println("Atendidos: "+max);
		
		Servidor.close();
	}

}
