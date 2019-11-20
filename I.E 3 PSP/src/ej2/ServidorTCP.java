package ej2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int Puerto = 6000;
		ServerSocket Servidor = new ServerSocket(Puerto);
		System.out.println("Escuchando en "+ Servidor.getLocalPort());
		
		Socket cliente1 = Servidor.accept();
		System.out.println("Puerto local: "+cliente1.getLocalPort());
		System.out.println("Puerto remoto: "+cliente1.getPort());
		
		Socket cliente2 = Servidor.accept();
		System.out.println("Puerto local: "+cliente2.getLocalPort());
		System.out.println("Puerto remoto: "+cliente2.getPort());
		
		Servidor.close();
	}

}
